package com.sp.studentPosts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sp.studentPosts.models.Posts;

@Mapper
public interface PostsMapper {
	
	@Select("select * from t_posts")
	List<Posts> findPosts();
	
	@Delete("delete from t_posts where id=#{id}")
    int deleteById(Integer id);
    
    @Insert("insert into t_posts(title,author,content,createdOn) values(#{title},#{author},#{content},now())")
    int insertPosts(Posts posts);
    
    @Select("select * from t_posts where id=#{id}")
    Posts findById(Integer id);
    
    @Update("update t_posts set title=#{title}, author=#{author}, content=#{content} where id=#{id}")
    int updatePosts(Posts posts);
	
}
