package com.ct.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ct.objects.Comment;
import com.ct.post.dataAccessObjects.CommentDAO;
import com.ct.post.serviceInterfaces.ICommentService;

public class CommentService implements ICommentService{
	
	@Autowired
	private CommentDAO commentDAO;
	
	public CommentService() {
		super(); 
	} 
	
	@Override
	public Comment createComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDAO.createComment(comment);
	}

	@Override
	public Comment getComment(int id) {
		// TODO Auto-generated method stub
		return commentDAO.getComment(id);
	}

	@Override
	public Comment updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDAO.updateComment(comment);
	}

	@Override
	public void deleteComment(int id) {
		commentDAO.deleteComment(id);
	}

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return commentDAO.getAllComments();
	}

	@Override
	public boolean commentExists(int id) {
		// TODO Auto-generated method stub
		return commentDAO.commentExists(id);
	}

}
