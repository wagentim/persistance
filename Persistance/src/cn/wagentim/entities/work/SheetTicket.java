package cn.wagentim.entities.work;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
public class SheetTicket implements IEntity
{
	@Id
	private int kpmID = 0;
	
	private int priority = IPriority.PRIORITY_UNKNOWN;
	
	private String nextStep = StringConstants.EMPTY_STRING;
	
	private Set<Comment> comments = null;
	
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

	@OneToMany(cascade=CascadeType.ALL, mappedBy="sheetTicket")
	public Set<Comment> getComments()
	{
		return comments;
	}

	public void setComments(Set<Comment> comments)
	{
		this.comments = comments;
	}

	@Override
	public String toString()
	{
		return "SheetTicket [kpmID=" + kpmID + ", priority=" + priority + ", nextStep=" + nextStep + ", status="
				+ status + "]";
	}
	
	
}
