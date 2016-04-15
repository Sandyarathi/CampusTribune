package com.ct.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ct.objects.Post;
import com.ct.objects.Vote;
import com.ct.post.services.PostService;
import com.ct.post.services.VoteService;

public class VoteController {
	
	VoteService voteService = new VoteService();
	PostService postService = new PostService();
	
	
	
	@RequestMapping(value="/post/{post_id}", method = RequestMethod.PUT, produces ="application/json")
	  public ResponseEntity<String> votePoll(@PathVariable int post_id, @RequestParam("choice") int choice_index) {
		  
		if(postService.postExists(post_id)){
			boolean success = voteService.voteOnPost(post_id,choice_index);
			if(success)
				return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
			else
				return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);

		}
		else
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	  }

}
