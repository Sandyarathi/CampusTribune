package com.ct.objects;

import org.joda.time.DateTime;

public class Post {
	
	private int post_id;
	private String headline;
	private String content;
	private String user_id;
	private int votes_score;
	private String category;
	private DateTime created_on;
	private DateTime lastEdited_on;
	private String webLink;
	private String imgURL;
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_headline() {
		return headline;
	}
	public void setPost_headline(String post_headline) {
		this.headline = post_headline;
	}
	public String getPost_content() {
		return content;
	}
	public void setPost_content(String post_content) {
		this.content = post_content;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getVotes_score() {
		return votes_score;
	}
	public void setVotes_score(int votes_score) {
		this.votes_score = votes_score;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public DateTime getCreated_on() {
		return created_on;
	}
	public void setCreated_on(DateTime created_on) {
		this.created_on = created_on;
	}
	public DateTime getEdited_on() {
		return lastEdited_on;
	}
	public void setEdited_on(DateTime edited_on) {
		this.lastEdited_on = edited_on;
	}
	public String getWebLink() {
		return webLink;
	}
	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	

}
