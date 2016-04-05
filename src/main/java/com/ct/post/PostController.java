package com.ct.post;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.objects.Post;
import com.ct.post.services.PostService;

@RestController
@RequestMapping("/cmpe295SandyarathiDas036/rest")
@Configuration
@ComponentScan("com.ct.service")
public class PostController {
		
	@Autowired
	private PostService postService;
	
	public PostController() {
		System.out.println("PostController()");
	}
	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Post> createPost( @RequestBody @Valid Post post){
		if(!postService.postExists(post.getPost_id())){
			Post emp = postService.createPost(post);
			if(emp !=null){
				return new ResponseEntity<Post>(emp,HttpStatus.CREATED);
			}
			else
				return new ResponseEntity<Post>(HttpStatus.CONFLICT);
		}
		else
			return new ResponseEntity<Post>(HttpStatus.CONFLICT);
	}
	
	
			

	
	
	@RequestMapping(value="/post/{post_id}", method = RequestMethod.GET, produces ="application/json")
    public ResponseEntity<Post> viewPost(@PathVariable("post_id") int postId ) {
	  if(postService.postExists(postId))
		  return new ResponseEntity<Post>(postService.getPost(postId), HttpStatus.OK);
	  else{
		  
		  return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/post/{post_id}", method = RequestMethod.PUT, produces ="application/json")
	public ResponseEntity<Post> updatePost(@PathVariable int post_id, @RequestBody @Valid Post post) {
		if(postService.postExists(post_id)){
			if(post.getPost_id() == post_id){
				return new ResponseEntity<Post>(postService.updatePost(post), HttpStatus.OK);
			}
			else{
				if(postService.postExists(post_id)){
					//return conflict error code, if the put request uses an already existing id while updating record
					return new ResponseEntity<Post>(HttpStatus.CONFLICT);
				}
				else
					return new ResponseEntity<Post>(postService.updatePost(post), HttpStatus.OK);
			}
		}
		else
			 return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);

	}
	
	
	@RequestMapping(value="/post/{post_id}", method = RequestMethod.DELETE, produces ="application/json")
    public ResponseEntity<String> deletePost(@PathVariable("post_id") int postId ) {
		if(postService.postExists(postId)){
		  postService.deletePost(postId);
		  return new ResponseEntity<String>( HttpStatus.OK);
	  }
	  else{
		  return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/post", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<List<Post>> listAllPosts() {
		List<Post> empList= postService.getAllPosts();
		if(!empList.isEmpty())
			return new ResponseEntity<List<Post>>(empList, HttpStatus.OK);		  
		else
			return new ResponseEntity<List<Post>>(HttpStatus.NOT_FOUND);  
			
	}
	

}
