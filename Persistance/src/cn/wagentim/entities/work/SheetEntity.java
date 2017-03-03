package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
@Table(name="sheet")
public class SheetEntity implements IEntity
{
	private long time = 0;
	
	@Id
	private String name = StringConstants.EMPTY_STRING;
	
	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public Long getId()
	{
		return 0L;
	}

}
