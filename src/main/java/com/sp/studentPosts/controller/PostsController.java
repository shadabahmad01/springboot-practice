package com.sp.studentPosts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.studentPosts.mapper.PostsMapper;
import com.sp.studentPosts.models.Posts;

@Controller
@RequestMapping("/posts/")
public class PostsController {

	@Autowired
	private PostsMapper postsMapper;
	
	@RequestMapping("postsList")
	public String postsList(Model model) {
		List<Posts> pList = postsMapper.findPosts();
		model.addAttribute("pList", pList);
		return "postslist";
	}
	
	@RequestMapping("doDeleteById/{id}")
    public String doDeleteById(@PathVariable Integer id) {
    	postsMapper.deleteById(id);
    	return "redirect:/posts/postsList";
    }
    
    @RequestMapping("doSavePosts")
    public String doSavePosts(Posts posts) {
    	postsMapper.insertPosts(posts);
    	return "redirect:/posts/postsList";
    }
    
    @RequestMapping("doPostsAdd")
    public String doPostsAdd() {
    	return "posts-add";
    }
    
    @RequestMapping("doFindById/{id}")
    public String doFindById(@PathVariable Integer id, Model model) {
    	Posts posts = postsMapper.findById(id);
    	model.addAttribute("posts", posts);
    	return "posts-update";
    }
    
    @RequestMapping("doUpdatePosts")
    public String doupdatePosts(Posts posts) {
    	postsMapper.updatePosts(posts);
    	return "redirect:/posts/postsList";
    }
    
}
