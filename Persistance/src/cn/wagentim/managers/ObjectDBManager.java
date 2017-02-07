package cn.wagentim.managers;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import cn.wagentim.basicutils.Validator;

public class ObjectDBManager extends AbstractPersistanceManager
{
	private static final String DB_PATH = "D:/db/";
	private EntityManager manager = null;
	
	
	@Override
	public void connectDB(String uri, int port, String dbName)
	{
		if( Validator.isNullOrEmpty(dbName) )
		{
			return ;
		}
		
		manager = Persistence.createEntityManagerFactory(DB_PATH + dbName).createEntityManager();
		
	}

	@Override
	public EntityManager getEntityManager()
	{
		return manager;
	}
}
