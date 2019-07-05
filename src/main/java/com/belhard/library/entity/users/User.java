package com.belhard.library.entity.users;

/**
 * Created by Raman Kashanok
 */
public abstract class User
{
	private Long id;
	private String name;
	private UserRole role;
	private Gender gender;

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

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
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

	@Override public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;

		User user = (User) o;

		if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null)
			return false;
		if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null)
			return false;
		if (getRole() != user.getRole())
			return false;
		if (getGender() != user.getGender())
			return false;
		return getLogin() != null ? getLogin().equals(user.getLogin()) : user.getLogin() == null;
	}

	@Override public int hashCode()
	{
		int result = getId() != null ? getId().hashCode() : 0;
		result = 31 * result + (getName() != null ? getName().hashCode() : 0);
		result = 31 * result + (getRole() != null ? getRole().hashCode() : 0);
		result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
		result = 31 * result + (getLogin() != null ? getLogin().hashCode() : 0);
		return result;
	}
}
