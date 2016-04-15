package com.ct.post.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ct.post.dataAccessObjects.PostDAO;
import com.ct.post.dataAccessObjects.VoteDAO;
import com.ct.post.serviceInterfaces.IVoteService;
import com.ct.objects.Vote;

public class VoteService implements IVoteService{
	
	@Autowired
	private VoteDAO voteDAO;
	
	
	
	public boolean voteOnPost(int post_id, int choice_index)  {
		
		
		return true;
	}

	

	

}
