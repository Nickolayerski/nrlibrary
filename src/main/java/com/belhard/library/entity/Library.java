package com.belhard.library.entity;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Raman Kashanok
 */
public class Library
{
	private String      name;
	private String      address;
	private List<Print> prints;
	private List<User>  users;

	public Library(String name, String address)
	{
		this.name = name;
		this.address = address;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public List<Print> getPrints()
	{
		return prints;
	}

	public void setPrints(List<Print> prints)
	{
		this.prints = prints;
	}

	public List<User> getUsers()
	{
		return users;
	}

	public void setUsers(List<User> users)
	{
		this.users = users;
	}

	public void addPrint(Print print)
	{
		this.prints.add(print);
	}

	public Print getPrint(final String name)
	{
		Print print = null;
		for (int i = 0; i < prints.size(); i++)
		{
			if(prints.get(i).getName().equals(name))
			{
				print =  prints.get(i);
			}
		}
		return print;
	}

}
