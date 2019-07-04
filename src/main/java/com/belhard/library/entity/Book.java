package com.belhard.library.entity

public class Book extends Print
{
	private BookGenre genre;
	private String author;
	private String ISBN;

	public BookGenre getGenre()
	{
		return genre;
	}

	public void setGenre(BookGenre genre)
	{
		this.genre = genre;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getISBN()
	{
		return ISBN;
	}

	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}

	@Override public String toString()
	{
		return "Book{" +
				super.toString() +
				"genre=" + genre +
				", author='" + author + '\'' +
				", ISBN='" + ISBN + '\'' +
				'}';
 	}
}
