package com.ct.objects;

import org.joda.time.DateTime;

public class Event {
	private int event_id;
	private String name;
	private String description;
	private String weblink;
	private DateTime eventDateTime;
	private DateTime createdOn;
	private DateTime editedOn;
	private String category;
	private int votes_score;
	private String location;
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeblink() {
		return weblink;
	}
	public void setWeblink(String weblink) {
		this.weblink = weblink;
	}
	public DateTime getEventDate() {
		return eventDateTime;
	}
	public void setEventDate(DateTime eventDate) {
		this.eventDateTime = eventDate;
	}
	public DateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}
	public DateTime getEditedOn() {
		return editedOn;
	}
	public void setEditedOn(DateTime editedOn) {
		this.editedOn = editedOn;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getVotes_score() {
		return votes_score;
	}
	public void setVotes_score(int votes_score) {
		this.votes_score = votes_score;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
