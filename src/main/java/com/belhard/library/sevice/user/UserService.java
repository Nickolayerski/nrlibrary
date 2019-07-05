package com.belhard.library.sevice.user;

import com.belhard.library.entity.users.User;

/**
 * Created by Raman Kashanok
 */
public interface UserService
{
	User getUserByUsernameAndPassword(String username, String password);
	User getUserById(Long id);
	void saveUser(User user) throws IllegalArgumentException;
}
