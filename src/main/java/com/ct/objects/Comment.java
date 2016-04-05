package com.ct.objects;

import org.joda.time.DateTime;

public class Comment {
	private String comment_id;
	private String post_id;
	private String commentedOnCommentId;
	private DateTime created_on;
	private String user_id;
	private DateTime lastEdited_on;
	private String commentString;
	private String webLink;
	
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getPost_id() {
		return post_id;
	}
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public String getCommentedOnCommentId() {
		return commentedOnCommentId;
	}
	public void setCommentedOnCommentId(String commentedOnCommentId) {
		this.commentedOnCommentId = commentedOnCommentId;
	}
	public DateTime getCreated_on() {
		return created_on;
	}
	public void setCreated_on(DateTime created_on) {
		this.created_on = created_on;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public DateTime getLastEdited_on() {
		return lastEdited_on;
	}
	public void setLastEdited_on(DateTime lastEdited_on) {
		this.lastEdited_on = lastEdited_on;
	}
	public String getCommentString() {
		return commentString;
	}
	public void setCommentString(String commentString) {
		this.commentString = commentString;
	}
	public String getWebLink() {
		return webLink;
	}
	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}
	
	
}
