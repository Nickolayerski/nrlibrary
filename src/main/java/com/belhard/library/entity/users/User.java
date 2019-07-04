package com.belhard.library.entity.users;

/**
 * Created by Raman Kashanok
 */
public abstract class User
{
	private Long id;
	private String name;
	private UserRole role;

	private String login;
	private String password;

	public User()
	{
	}

	public User(String login, String password, UserRole role)
	{
		this.login = login;
		this.password = password;
		this.role = role;
	}

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

	public UserRole getRole()
	{
		return role;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override public String toString()
	{
		return  "id=" + id +
				", name='" + name + '\'' +
				", role=" + role;
	}
}
