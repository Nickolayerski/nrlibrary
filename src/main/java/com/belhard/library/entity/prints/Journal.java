package com.belhard.library.entity.prints;

/**
 * Created by Raman Kashanok
 */
public class Journal extends Print
{
	private boolean isSatin;

	public boolean isSatin()
	{
		return isSatin;
	}

	public void setSatin(boolean satin)
	{
		isSatin = satin;
	}

	@Override public String toString()
	{
		return "Magazine{" +
				super.toString() +
				", isSatin=" + isSatin + '}';
	}
}
