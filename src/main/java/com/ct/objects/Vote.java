package com.ct.objects;

import org.joda.time.DateTime;

public class Vote {
	private String post_id;
	private int noOfUpVotes;
	private int noOfDownVotes;
	private DateTime lastVotedOn;
	public String getPost_id() {
		return post_id;
	}
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public int getNoOfUpVotes() {
		return noOfUpVotes;
	}
	public void setNoOfUpVotes(int noOfUpVotes) {
		this.noOfUpVotes = noOfUpVotes;
	}
	public int getNoOfDownVotes() {
		return noOfDownVotes;
	}
	public void setNoOfDownVotes(int noOfDownVotes) {
		this.noOfDownVotes = noOfDownVotes;
	}
	public DateTime getLastVotedOn() {
		return lastVotedOn;
	}
	public void setLastVotedOn(DateTime lastVotedOn) {
		this.lastVotedOn = lastVotedOn;
	}

}
