package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
@Table(name="mustfixtickets")
public class TicketComment implements IEntity
{
	private int number = 0;
	
	private long time = 0;
	
	private String content = StringConstants.EMPTY_STRING;
	
	private String author = StringConstants.EMPTY_STRING;
	
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

	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	@Override
	public String toString()
	{
		return "TicketComment [number=" + number + ", time=" + time + ", content=" + content + ", author=" + author
				+ "]";
	}
	
}
