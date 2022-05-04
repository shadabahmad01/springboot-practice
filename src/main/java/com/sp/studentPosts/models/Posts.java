package com.sp.studentPosts.models;

import java.util.Date;

public class Posts {
	
	private Long id;  //have auto increment id
	private String title;   // Post title
	private String author;	//Post author
	private String content;	//Post content;
	private Date createdOn;	//Posting time;
	//private Date updatedOn;	//posts updation time;
	//later add choicefield(publish or draft)
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Override
    public String toString() {
        return "Posts [id=" + id + ", title=" + title + ", author=" + author + ", content=" + content + ", createdOn=" + createdOn + "]";
    }
	
}
