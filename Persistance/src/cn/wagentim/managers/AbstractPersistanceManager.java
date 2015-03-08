package cn.wagentim.managers;

import java.util.List;

import javax.persistence.EntityManager;

import cn.wagentim.entities.IEntity;
import cn.wagentim.utils.StatementHelper;


public abstract class AbstractPersistanceManager implements IPersistanceManager
{

	public Long addOrUpdateEntity(Object entity, Long id)
	{
		if( null == id || 0 == id )
    	{
    		return addNewEntity(entity);
    	}
    	else
    	{
    		mergeEntity(entity);
    		return id;
    	}
	}
	
	protected void mergeEntity(final Object entity)
    {
		EntityManager em = getEntityManager();
    	em.getTransaction().begin();
    	em.merge(entity);
    	em.getTransaction().commit();
    }

	abstract protected EntityManager getEntityManager();

	protected Long addNewEntity(final Object entity)
    {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		
		IEntity result = (IEntity) em.find(entity.getClass(), entity);
		return result.getId();
    }
	
	public List<?> getAllEntities(Class<?> entityType)
    {
		EntityManager em = getEntityManager();
		return em.createQuery(StatementHelper.jpaGetAllEntity(entityType)).getResultList();
    }

	public void deleteEntity(Class<?> entityType, Long uid)
	{
		EntityManager em = getEntityManager();
		Object c = em.find(entityType, uid);

		if( null == c )
		{
			return;
		}
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}
}
