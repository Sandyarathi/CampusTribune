package com.ct.post.dataAccessInterfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ct.objects.Post;

/**
* DAO interface for Post to perform CRUD operation.
* */
@Repository
public interface IPostDAO {
/**
* Used to Create the Post Information
* @param employee
* @return {@link Post}
*/
public Post createPost(Post employee);

/**
* Getting the Post Information using Id
* @param id
* @return {@link Post}
*/
public Post getPost(int id);

/**
* Used to Update the Post Information
* @param employee
* @return {@link Post}
*/

public Post updatePost(Post employee);

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
 * Check if employee record exists
 * */
 public boolean postExists(int id);
 
}