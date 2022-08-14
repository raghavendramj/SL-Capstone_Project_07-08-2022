package com.simpliearn.service;

import java.util.List;

import com.simpliearn.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> getUsers();

	User getUser(Long userId);
}
