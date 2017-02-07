package cn.wagentim.managers;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;

import cn.wagentim.basicutils.Validator;


public final class SqliteManager extends AbstractPersistanceManager
{
	private static final String NAME_JDBC = "org.sqlite.JDBC";
	private Connection c;
	
	@Override
	public void connectDB(String uri, int port, String dbName)
	{
	    if( Validator.isNullOrEmpty(dbName) )
		{
			return;
		}
		
		try
		{
			Class.forName(NAME_JDBC);
			c = DriverManager.getConnection("jdbc:sqlite:"+dbName+".db");
		}
		catch(Exception e)
		{
			return;
		}
		
		if( null == c )
		{
			return;
		}
	    
	}

	@Override
	public EntityManager getEntityManager()
	{
		// TODO Auto-generated method stub
		return null;
	}
}