package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.Id;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
public class SheetTicketEntity implements IEntity
{
	@Id
	private int kpmID = 0;
	
	private int priority = IPriority.PRIORITY_UNKNOWN;
	
	private String nextStep = StringConstants.EMPTY_STRING;
	
	private String status = IStatus.NONE;
	
	@Override
	public Long getId()
	{
		return Long.valueOf("" + getKpmID());
	}
	
	public int getKpmID()
	{
		return kpmID;
	}

	public void setKpmID(int kpmID)
	{
		this.kpmID = kpmID;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	public String getNextStep()
	{
		return nextStep;
	}

	public void setNextStep(String nextStep)
	{
		this.nextStep = nextStep;
	}

	@Override
	public String toString()
	{
		return "SheetTicket [kpmID=" + kpmID + ", priority=" + priority + ", nextStep=" + nextStep + ", status="
				+ status + "]";
	}
	
	
}
