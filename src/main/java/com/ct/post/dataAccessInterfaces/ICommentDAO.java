package com.ct.post.dataAccessInterfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ct.objects.Comment;

/**
* DAO interface for Comment to perform CRUD operation.
* */
@Repository
public interface ICommentDAO {
/**
* Used to Create the Comment Information
* @param employee
* @return {@link Comment}
*/
public Comment createComment(Comment employee);

/**
* Getting the Comment Information using Id
* @param id
* @return {@link Comment}
*/
public Comment getComment(int id);

/**
* Used to Update the Comment Information
* @param employee
* @return {@link Comment}
*/

public Comment updateComment(Comment employee);

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
 * Check if employee record exists
 * */
 public boolean commentExists(int id);
 
}