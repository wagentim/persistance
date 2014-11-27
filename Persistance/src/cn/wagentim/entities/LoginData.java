package cn.wagentim.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class LoginData
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String site_name;
	private String site_link;
	private String user_name;
	private String password;
	private String auth_token;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getSite_name()
	{
		return site_name;
	}
	public void setSite_name(String site_name)
	{
		this.site_name = site_name;
	}
	public String getSite_link()
	{
		return site_link;
	}
	public void setSite_link(String site_link)
	{
		this.site_link = site_link;
	}
	public String getUser_name()
	{
		return user_name;
	}
	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getAuth_token()
	{
		return auth_token;
	}
	public void setAuth_token(String auth_token)
	{
		this.auth_token = auth_token;
	}
	
	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("[ ").
			append("id=").append(getId()).append(", ").
			append("site_name=").append(getSite_name()).append(", ").
			append("site_link=").append(getSite_link()).append(", ").
			append("user_name=").append(getUser_name()).append(", ").
			append("password=").append(getPassword()).append(", ").
			append("auth_token=").append(getAuth_token()).
			append(" ]");
		
		return sb.toString();
	}
}
