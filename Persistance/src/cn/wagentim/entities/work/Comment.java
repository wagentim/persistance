package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cn.wagentim.basicutils.StringConstants;

@Entity
public class Comment
{
	@Id
	@GeneratedValue
	private int id;
	
	private SheetTicket sheetTicket;
	
	private long time = 0;
	
	private String comment = StringConstants.EMPTY_STRING;
	
	private String author = StringConstants.EMPTY_STRING;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}


	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	@ManyToOne
	@JoinColumn(name="kpmID", nullable=false)
	public SheetTicket getSheetTicket()
	{
		return sheetTicket;
	}

	public void setSheetTicket(SheetTicket sheetTicket)
	{
		this.sheetTicket = sheetTicket;
	}
}
