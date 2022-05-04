package com.sp.studentPosts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.studentPosts.mapper.PostsMapper;
import com.sp.studentPosts.models.Posts;

@Service
public class PostsServiceImpl implements PostsService {

	@Autowired
	private PostsMapper postsMapper;
	
	@Override
	public List<Posts> findPosts() {
		return postsMapper.findPosts();
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		long t1 = System.currentTimeMillis();
		int rows = postsMapper.deleteById(id);
		long t2 = System.currentTimeMillis();
		System.out.println("execute time:"+(t2-t1));
		return rows;
	}

	@Override
	public int savePosts(Posts posts) {
		// TODO Auto-generated method stub
		int rows = postsMapper.insertPosts(posts);
		return rows;
	}

	@Override
	public Posts findById(Integer id) {
		// TODO Auto-generated method stub
		return postsMapper.findById(id);
	}

	@Override
	public int updatePosts(Posts posts) {
		// TODO Auto-generated method stub
		return postsMapper.updatePosts(posts);
	}

}
