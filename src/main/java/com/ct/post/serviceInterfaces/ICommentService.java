package com.ct.post.serviceInterfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ct.objects.Comment;
@Service
public interface ICommentService {
	/**
	* Used to Create the Comment Information
	* @param comment
	* @return {@link Comment}
	*/
	public Comment createComment(Comment comment);

	/**
	* Getting the Comment Information using Id
	* @param id
	* @return {@link Comment}
	*/
	public Comment getComment(int id);

	/**
	* Used to Update the Comment Information
	* @param comment
	* @return {@link Comment}
	*/

	public Comment updateComment(Comment comment);

	/**
	* Deleting the Comment Information using Id
	* @param id
	*/
	public void deleteComment(int id);

	/**
	* Getting the All Comments information
	* @return
	*/
	public List<Comment> getAllComments();
	/**
	 * Check if record exists
	 */
	public boolean commentExists(int id);

}
