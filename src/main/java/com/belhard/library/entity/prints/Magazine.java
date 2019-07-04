package com.belhard.library.entity.prints;

/**
 * Created by Raman Kashanok
 */
public class Magazine extends Print
{
	private String theme;
	private int daysPeriod;

	public String getTheme()
	{
		return theme;
	}

	public void setTheme(String theme)
	{
		this.theme = theme;
	}

	public int getDaysPeriod()
	{
		return daysPeriod;
	}

	public void setDaysPeriod(int daysPeriod)
	{
		this.daysPeriod = daysPeriod;
	}

	@Override public String toString()
	{
		return "Magazine{" +
				super.toString() +
				", theme=" + theme +
				", daysPeriod=" + daysPeriod + '}';
	}
}
