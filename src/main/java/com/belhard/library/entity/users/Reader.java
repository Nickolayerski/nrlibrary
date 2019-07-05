package com.belhard.library.entity.users;

import com.belhard.library.entity.prints.Print;

import java.util.List;

/**
 * Created by Raman Kashanok
 */
public class Reader extends User
{
	private Integer number;
	private Gender gender;
	private List<Print> rentedPrints;

	public Reader()
	{
		super();
	}

	public Reader(String login, String password, Integer number, Gender gender)
	{
		super(login, password, UserRole.READER);
		this.number = number;
		this.gender = gender;
	}

	public Integer getNumber()
	{
		return number;
	}

	public void setNumber(Integer number)
	{
		this.number = number;
	}

	public List<Print> getRentedPrints()
	{
		return rentedPrints;
	}

	public void setRentedPrints(List<Print> rentedPrints)
	{
		this.rentedPrints = rentedPrints;
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
		return "Reader{" +
				super.toString() +
				", number=" + number +
				", rentedPrints=" + rentedPrints +
				", gender=" + gender + '}';
	}
}
