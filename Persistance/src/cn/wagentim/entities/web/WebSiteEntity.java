package cn.wagentim.entities.web;

import java.io.Serializable;
import java.util.List;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.webs.IWebTypes;

/**
 * @author wagentim
 *
 */
@Entity
@Table(name="website")
public class WebSiteEntity implements Serializable, IEntity
{

	private static final long serialVersionUID = -743122521914799055L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="WEB_ID")
	private Long id;
	private String name = StringConstants.EMPTY_STRING;
	private String host = StringConstants.EMPTY_STRING;
	private String path = StringConstants.EMPTY_STRING;
	private int webType = IWebTypes.TYPE_UNSORTED;
	private String pageContent = StringConstants.EMPTY_STRING;
	private String userName = StringConstants.EMPTY_STRING;
	private String password = StringConstants.EMPTY_STRING;
	private String auth = StringConstants.EMPTY_STRING;
	private String schema = StringConstants.EMPTY_STRING;
	@OneToMany(orphanRemoval=true)
	@JoinColumn(name="WEB_ID")
	private List<ResourceEntity> resources;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHost()
	{
		return host;
	}

	public void setHost(String host)
	{
		this.host = host;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

    public int getWebType()
    {
        return webType;
    }

    public void setWebType(int webType)
    {
        this.webType = webType;
    }

    public String getPageContent()
    {
        return pageContent;
    }

    public void setPageContent(String pageContent)
    {
        this.pageContent = pageContent;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAuth()
    {
        return auth;
    }

    public void setAuth(String auth)
    {
        this.auth = auth;
    }

    public String getSchema()
    {
        return schema;
    }

    public void setSchema(String schema)
    {
        this.schema = schema;
    }
    
    public void addResource(ResourceEntity resource)
    {
    	resources.add(resource);
    	if( resource.getOwner() != this )
    	{
    		resource.setOwner(this);
    	}
    }
}
