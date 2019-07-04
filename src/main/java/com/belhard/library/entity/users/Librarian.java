package com.belhard.library.entity.users;

/**
 * Created by Raman Kashanok
 */
public class Librarian extends User
{
	private String address;
	private Gender gender;

	public Librarian()
	{
		super();
	}

	public Librarian(String login, String password, String address, Gender gender)
	{
		super(login, password, UserRole.LIBRARIAN);
		this.address = address;
		this.gender = gender;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	@Override public String toString()
	{
		return "Librarian{" +
				super.toString() +
				", address=" + address +
				", gender=" + gender + '}';
	}
}
