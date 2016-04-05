package com.ct.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ct.objects.Post;
import com.ct.post.dataAccessObjects.PostDAO;
import com.ct.post.serviceInterfaces.IPostService;


public class PostService implements IPostService {

	@Autowired
	private PostDAO postDAO;
	
	public PostService() {
		super(); 
	} 
	
	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return postDAO.createPost(post);
	}

	@Override
	public Post getPost(int id) {
		// TODO Auto-generated method stub
		return postDAO.getPost(id);
	}

	@Override
	public Post updatePost(Post post) {
		// TODO Auto-generated method stub
		return postDAO.updatePost(post);
	}

	@Override
	public void deletePost(int id) {
		postDAO.deletePost(id);
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return postDAO.getAllPosts();
	}

	@Override
	public boolean postExists(int id) {
		// TODO Auto-generated method stub
		return postDAO.postExists(id);
	}

}
