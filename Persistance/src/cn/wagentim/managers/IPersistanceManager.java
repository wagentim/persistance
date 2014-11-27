package cn.wagentim.managers;

import java.util.List;

public interface IPersistanceManager
{
    	/**
    	 * Connect to the DB. The Connection will be cached. By first time a new instance will be created.
    	 * @param dbName the name of the database
    	 * @return Object the manager of this database
    	 */
	Object connectDB(String dbName);
	void addEntity(Object entity);
	void addEntities(List<Object> entities);
	void disconnectDB();
}