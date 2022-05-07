package com.sp.studentPosts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.studentPosts.mapper.UsersMapper;
import com.sp.studentPosts.models.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> findAllUsers() {
		return usersMapper.findAllUsers();
	}

	@Override
	public Users findUsersById(Integer id) {
		return usersMapper.findUsersById(id);
	}

	@Override
	public int insertUsers(Users users) {
		// TODO Auto-generated method stub
		int rows = usersMapper.insertUsers(users);
		return rows;
	}

	

}
