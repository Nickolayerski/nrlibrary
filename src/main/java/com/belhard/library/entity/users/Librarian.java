package com.belhard.library.entity.users;

/**
 * Created by Raman Kashanok
 */
public class Librarian extends User
{
	private String address;

	public Librarian()
	{
		super();
	}

	public Librarian(String login, String password, String address)
	{
		super(login, password, UserRole.LIBRARIAN);
		this.address = address;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}


	@Override public String toString()
	{
		return "Librarian{" +
				super.toString() +
				", address=" + address + '}';
	}
}
