package cn.wagentim.managers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private EntityManagerFactory factory = null;
	private Map<Object, Object> entityManagerMap = null;
	
	public ObjectDBManager()
	{
	    super();
	    entityManagerMap = new HashMap<Object, Object>(10);
	}
	
	@Override
	public Object connectDB(String dbName)
	{
		if( null == dbName || dbName.isEmpty() )
		{
			logger.log(Log.LEVEL_ERROR, "No Table Location is set");
			return null;
		}
		
		Object result = findDB(dbName);
		
		if( null == result )
		{
		    result = Persistence.createEntityManagerFactory(DB_PATH+dbName);
		    cache.put(dbName, result);
		}
		
		this.factory = (EntityManagerFactory) result;
		
		return result;
	}
	
	@Override
	public synchronized void addEntity(Object entity)
	{
	    EntityManager manager = factory.createEntityManager(entityManagerMap);
	    manager.getTransaction().begin();
	    manager.persist(entity);
	    manager.getTransaction().commit();
	    manager.close();
	}

	@Override
	public synchronized void addEntities(List<Object> entities)
	{
	    if( null == entities || entities.isEmpty() )
	    {
		return;
	    }
	    
	    EntityManager manager = factory.createEntityManager(entityManagerMap);
	    manager.getTransaction().begin();
	    
	    for(Object object: entities)
	    {
		manager.persist(object);
	    }
	    
	    manager.getTransaction().commit();
	    manager.close();
	}

	@Override
	public void disconnectDB()
	{
	    // TODO Auto-generated method stub
	    
	}
}
