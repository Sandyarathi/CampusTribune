package com.ct.post.serviceInterfaces;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ct.objects.Post;
@Service
public interface IPostService {
	/**
	* Used to Create the Post Information
	* @param post
	* @return {@link Post}
	*/
	public Post createPost(Post post);

	/**
	* Getting the Post Information using Id
	* @param id
	* @return {@link Post}
	*/
	public Post getPost(int id);

	/**
	* Used to Update the Post Information
	* @param post
	* @return {@link Post}
	*/

	public Post updatePost(Post post);

	/**
	* Deleting the Post Information using Id
	* @param id
	*/
	public void deletePost(int id);

	/**
	* Getting the All Posts information
	* @return
	*/
	public List<Post> getAllPosts();
	/**
	 * Check if record exists
	 */
	public boolean postExists(int id);
}





	

	

