package com.sp.studentPosts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sp.studentPosts.models.Users;

@Mapper
public interface UsersMapper {

	@Select("select * from t_users")
	List<Users> findAllUsers();
	
	@Select("select * from t_users where id=#{id}")
	Users findUsersById(Integer id);
}
