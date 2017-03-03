package cn.wagentim.entities.work;

import java.io.Serializable;

import cn.wagentim.basicutils.StringConstants;

public class Comment implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -483529129999682203L;

	private long time = 0;
	
	private String comment = StringConstants.EMPTY_STRING;
	
	private String author = StringConstants.EMPTY_STRING;

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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + (int) (time ^ (time >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (author == null)
		{
			if (other.author != null)
				return false;
		}
		else if (!author.equals(other.author))
			return false;
		if (comment == null)
		{
			if (other.comment != null)
				return false;
		}
		else if (!comment.equals(other.comment))
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	
}
