package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.wagentim.entities.web.IEntity;

@Entity
@Table(name="mustfixtickets")
public final class MustFix implements IEntity, ISupplier, ITicketStatus
{
	
	@Id
	private int number = 0;
	
	private int priority = 0;

	private String next = NONE;
	
	private String status = STATUS_OPEN;

	@Override
	public Long getId()
	{
		return (long)number;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	public String getNext()
	{
		return next;
	}

	public void setNext(String next)
	{
		this.next = next;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	@Override
	public String toString()
	{
		return "MustFix [number=" + number + ", priority=" + priority + ", next=" + next + ", status=" + status + "]";
	}

	
}
