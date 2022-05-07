package com.sp.studentPosts.service;

import java.util.List;

import com.sp.studentPosts.models.Users;

public interface UsersService {

	List<Users> findAllUsers();
	Users findUsersById(Integer id);
	int insertUsers(Users users);
}
