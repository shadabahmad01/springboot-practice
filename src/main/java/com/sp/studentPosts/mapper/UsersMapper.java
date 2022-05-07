package com.sp.studentPosts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sp.studentPosts.models.Users;

@Mapper
public interface UsersMapper {

	@Select("select * from users")
	List<Users> findAllUsers();
	
	@Select("select * from users where id=#{id}")
	Users findUsersById(Integer id);

	@Insert("insert into users(name,salary) values(#{name},#{salary})")
	int insertUsers(Users users);
}
