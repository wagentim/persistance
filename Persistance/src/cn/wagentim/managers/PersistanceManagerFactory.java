package cn.wagentim.managers;

public final class PersistanceManagerFactory
{
    public static final int DB_OBJECT_DB = 0x00;
    public static final int DB_SQLITE = 0x01;
    public static final int DB_MYSQL = 0x02;
    
    public static final IPersistanceManager createManager(int type)
    {
		if( type < 0 )
		{
		    return null;
		}
		
		switch(type)
		{
			case DB_OBJECT_DB:
			    return new ObjectDBManager();
			case DB_SQLITE:
			    return new SqliteManager();
			default:
			    return null;
		}
    }
    
    public static final IPersistanceManager createManager()
    {
    	return new ObjectDBManager();
    }
}
