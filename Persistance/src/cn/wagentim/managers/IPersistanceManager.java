package cn.wagentim.managers;

import java.util.List;

import javax.persistence.EntityManager;

import cn.wagentim.entities.web.IEntity;


public interface IPersistanceManager
{
	public Long addOrUpdateEntity(IEntity entity);
	public void connectDB(String uri, int port, String name);
	public List<?> getAllEntities(Class<?> entityType);
	public void deleteEntity(Class<?> entityType, Long id);
	public EntityManager getEntityManager();
	public void addOrUpdateEntityList(List<IEntity> entities);
}