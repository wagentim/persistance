package cn.wagentim.managers;

import java.util.List;

import cn.wagentim.entities.IEntity;


public interface IPersistanceManager
{
	public Long addOrUpdateEntity(IEntity entity);
	public void connectDB(String uri, int port, String name);
	public List<?> getAllEntities(Class<?> entityType);
	public void deleteEntity(Class<?> entityType, Long id);
	public Object getEntity(Class<?> type, Long id);
}