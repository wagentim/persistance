package cn.wagentim.managers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.wagentim.qlogger.channel.DefaultChannel;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.logger.Log;
import de.wagentim.qlogger.service.QLoggerService;

public class ObjectDBManager extends AbstractPersistanceManager
{
	private static final String DB_PATH = "$objectdb/db/";
	private final LogChannel logger = QLoggerService.getChannel(QLoggerService.addChannel(new DefaultChannel("ObjectDB")));
	private EntityManager manager = null;
	
	@Override
	public void connect(String tableName)
	{
		if( null == tableName || tableName.isEmpty() )
		{
			logger.log(Log.LEVEL_ERROR, "No Table Location is set");
			return;
		}
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(DB_PATH+tableName);
		manager = factory.createEntityManager();
	}
	
	public synchronized void addEntitiy(Object object)
	{
		manager.getTransaction().begin();
		manager.persist(object);
		manager.getTransaction().commit();
	}
	
	public synchronized void addEntites(List<Object> entities)
	{
		if( null == entities || entities.isEmpty() )
		{
			return;
		}
		
		manager.getTransaction().begin();
		
		for(Object object: entities)
		{
			manager.persist(object);
		}
		
		manager.getTransaction().commit();
	}
	
}
