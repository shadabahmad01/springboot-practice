package com.sp.studentPosts.service;

import java.util.List;

import com.sp.studentPosts.models.Posts;

public interface PostsService {

		List<Posts> findPosts();
		int deleteById(Integer id);
		int savePosts(Posts posts);
		Posts findById(Integer id);
		int updatePosts(Posts posts);
		
}
