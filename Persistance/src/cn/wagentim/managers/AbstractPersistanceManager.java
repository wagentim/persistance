package cn.wagentim.managers;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPersistanceManager implements IPersistanceManager
{
	protected Map<String, Object> cache = null;

	public AbstractPersistanceManager()
	{
		cache = new HashMap<String, Object>(50);
	}

	/**
	 * Each DB has one connection. The connection will be cached after it has
	 * been created.
	 * 
	 * @param dbName
	 * @return
	 */
	protected Object findDB(String dbName)
	{
		return cache.containsKey(dbName) ? cache.get(dbName) : null;
	}

	public boolean isDBNameExisted(String dbName)
	{
		return cache.containsKey(dbName);
	}
}
