package com.belhard.library.sevice.user;

import com.belhard.library.entity.Library;
import com.belhard.library.entity.users.User;

/**
 * Created by Raman Kashanok
 */
public class UserServiceImpl implements UserService
{

	private Library library;

	public UserServiceImpl(Library library)
	{
		this.library = library;
	}

	public User getUserByUsernameAndPassword(String username, String password)
	{
		return library.getUsers().stream().filter(user -> user.getLogin().equals(username) && user.getPassword().equals(password)).findFirst().orElse(null);
	}

	public User getUserById(Long id)
	{
		return library.getUsers().stream().filter(user -> user.equals(id)).findFirst().orElse(null);
	}

	public void saveUser(User user) throws IllegalArgumentException
	{
		if (!library.getUsers().contains(user))
		{
			library.getUsers().add(user);
		}
		else
		{
			throw new IllegalArgumentException("saveUser exception. User already exists: " + user);
		}
	}
}
