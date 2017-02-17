package com.blog.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Article {
	private Integer id;
	private String title;
	private String username;
	private String content;
	private Date date;
	private Integer hasread;
	private Integer comment;
	
	public Integer getComment() {
		return comment;
	}
	public void setComment(Integer comment) {
		this.comment = comment;
	}
	public Integer getHasread() {
		return hasread;
	}
	public void setHasread(Integer hasread) {
		this.hasread = hasread;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
