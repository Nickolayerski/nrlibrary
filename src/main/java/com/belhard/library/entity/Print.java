package com.belhard.library.entity;

/**
 * Created by Raman Kashanok
 */
public abstract class Print
{
	private Long id;
	private String name;
	private PrintType type;
	private Boolean isAvailable;

	public Print(){
		this.isAvailable = true;
	}

	public Print(String name, PrintType type)
	{
		this.name = name;
		this.type = type;
		this.isAvailable = true;
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

	public PrintType getType()
	{
		return type;
	}

	public void setType(PrintType type)
	{
		this.type = type;
	}

	public Boolean getAvailable()
	{
		return isAvailable;
	}

	public void setAvailable(Boolean available)
	{
		isAvailable = available;
	}

	@Override public String toString()
	{
		return 	"id=" + id +
				", name='" + name + '\'' +
				", type=" + type +
				", isAvailable=" + isAvailable;
	}
}

