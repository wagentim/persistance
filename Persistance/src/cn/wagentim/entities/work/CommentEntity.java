package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
@IdClass(Comment.class)
public class CommentEntity implements IEntity, Comparable<CommentEntity>
{
	
	@GeneratedValue
	private int id;
	
	@Id
	private long time = 0;
	
	@Id
	private String author = StringConstants.EMPTY_STRING;
	
	@Id
	private String comment = StringConstants.EMPTY_STRING;
	
	private int kpmID;

	@Override
	public Long getId()
	{
		return Long.valueOf(id);
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public int getKpmID()
	{
		return kpmID;
	}

	public void setKpmID(int kpmID)
	{
		this.kpmID = kpmID;
	}

	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}

	@Override
	public String toString()
	{
		return "CommentEntity [id=" + id + ", time=" + time + ", author=" + author + ", comment=" + comment + ", kpmID="
				+ kpmID + "]";
	}

	@Override
	public int compareTo(CommentEntity obj)
	{
		long value = obj.getTime() - this.getTime();
		return (int)value;
	}

}
