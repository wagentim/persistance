package cn.wagentim.managers;

import java.util.List;

import javax.persistence.EntityManager;

import cn.wagentim.entities.web.IEntity;
import cn.wagentim.utils.StatementHelper;


public abstract class AbstractPersistanceManager implements IPersistanceManager
{

    public Long addOrUpdateEntity(IEntity entity)
	{
        Long id = entity.getId();

		if( null == id || 0 == id )
    	{
    		addNewEntity(entity);
    		return entity.getId();
    	}
    	else
    	{
    		mergeEntity(entity);
    		return id;
    	}
	}
    
    public Long addOrUpdateEntityOnlyPositiveNumber(IEntity entity)
	{
        Long id = entity.getId();

        System.out.println("ID: " + id);
		if( id <= 0 )
    	{
    		return (long) 0;
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
	
	public void addOrUpdateEntityList(List<IEntity> entities)
	{
		if(entities.isEmpty())
		{
			return;
		}
		
		for( int i = 0; i < entities.size(); i++ )
		{
			IEntity entity = entities.get(i);
			
			if( null != entity )
			{
				addOrUpdateEntityOnlyPositiveNumber(entity);
			}
		}
		
	}
}
