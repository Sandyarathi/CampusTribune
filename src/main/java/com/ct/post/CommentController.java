package com.ct.post;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ct.objects.Comment;
import com.ct.post.services.CommentService;
import com.ct.post.services.PostService;



public class CommentController {
	
	PostService postService = new PostService();
	CommentService commentService = new CommentService();
	
	@RequestMapping(value="/post/{post_id}/comments", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Comment> createComment(@PathVariable int post_id, @RequestBody @Valid Comment comment) {
		return null;
	}
	
	@RequestMapping(value="/comments/{comment_id}", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<String> viewComment(@PathVariable String comment_id) {
		return null;
	}
	@RequestMapping(value="/post/{post_id}/comments/{comment_id}", method = RequestMethod.GET, produces ="application/json")
	  public ResponseEntity<Comment> viewCommentOfPost(@PathVariable int post_id,@PathVariable String comment_id){
		
		return null;

	  }
	
	@RequestMapping(value="/post/{post_id}/comments", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<ArrayList<Comment>> listAllComments(@PathVariable int post_id) {
		return null;
	
	}
	@RequestMapping(value="/post/{post_id}/comments/{comment_id}", method = RequestMethod.DELETE, produces ="application/json")
	  public ResponseEntity<String>  deleteComment(@PathVariable int post_id,@PathVariable String comment_id) {
		return null;
		 
	  }

}
