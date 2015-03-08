package cn.wagentim.managers;

import java.util.List;


public interface IPersistanceManager
{
	public Long addOrUpdateEntity(Object entity, Long id);
	public void connectDB(String uri, int port, String name);
	public List<?> getAllEntities(Class<?> entityType);
	public void deleteEntity(Class<?> entityType, Long id);
}