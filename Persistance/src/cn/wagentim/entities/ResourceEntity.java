package cn.wagentim.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.wagentim.basicutils.StringConstants;

@Entity
@Table(name="resource")
public class ResourceEntity implements IEntity, Serializable
{
	private static final long serialVersionUID = 5102677448184758453L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int tpye = IResourceType.TYPE_UNKNOWN;
	private long length = 0;
	private String extension = StringConstants.EMPTY_STRING;
	private String name = StringConstants.EMPTY_STRING;
	private byte[] data = null;
	private long detectTime = System.currentTimeMillis();
	private String domain = StringConstants.EMPTY_STRING;
	private String path = StringConstants.EMPTY_STRING;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public int getTpye()
	{
		return tpye;
	}
	public void setTpye(int tpye)
	{
		this.tpye = tpye;
	}
	public String getExtension()
	{
		return extension;
	}
	public void setExtension(String extension)
	{
		this.extension = extension;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public byte[] getData()
	{
		return data;
	}
	public void setData(byte[] data)
	{
		this.data = data;
	}
	public long getLength()
	{
		return length;
	}
	public void setLength(long length)
	{
		this.length = length;
	}
	public long getDetectTime()
	{
		return detectTime;
	}
	public void setDetectTime(long detectTime)
	{
		this.detectTime = detectTime;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getDomain()
	{
		return domain;
	}
	public void setDomain(String domain)
	{
		this.domain = domain;
	}
	
}
