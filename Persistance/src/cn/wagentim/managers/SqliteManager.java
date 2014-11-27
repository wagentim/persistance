package cn.wagentim.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import de.wagentim.qlogger.channel.DefaultChannel;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.logger.Log;
import de.wagentim.qlogger.service.QLoggerService;


public final class SqliteManager extends AbstractPersistanceManager
{
	private static final String NAME_JDBC = "org.sqlite.JDBC";
	private final LogChannel logger = QLoggerService.getChannel(QLoggerService.addChannel(new DefaultChannel("SQLite"))); 
	private Connection c = null;
	private Statement stmt = null;
	
	public void connect(String dbName)
	{
		if( null == dbName || dbName.isEmpty() )
		{
			logger.log(Log.LEVEL_ERROR, "DB name is Null or Empty");
			return;
		}
		
		try
		{
			Class.forName(NAME_JDBC);
			c = DriverManager.getConnection("jdbc:sqlite:"+dbName+".db");
		}
		catch(Exception e)
		{
			logger.log(Log.LEVEL_ERROR, "Failt to connect to DB 1%", dbName);
			
			return;
		}
		
		if( null == c )
		{
			logger.log(Log.LEVEL_ERROR, "Connect is null");
			return;
		}
	}
	
	public void createTable(String sql)
	{
		if( null == c )
		{
			return;
		}
		
		try
		{
			stmt = c.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void close()
	{
		if( null != c  )
		{
			try
			{
				c.close();
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}