package com.sp.studentPosts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.studentPosts.mapper.UsersMapper;
import com.sp.studentPosts.models.Users;


@Controller
@RequestMapping("/users/")
public class UsersController {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@RequestMapping("usersList")
	public String postsList(Model model) {
		List<Users> uList = usersMapper.findAllUsers();
		model.addAttribute("uList", uList);
		return "userslist";
	}
	
	@RequestMapping("register")
	public String register(Users users) {
		usersMapper.insertUsers(users);
		return "redirect:/users/usersList";
	}

	@RequestMapping("signUp")
	public String signUp() {
		return "signup";
	}
	
}
