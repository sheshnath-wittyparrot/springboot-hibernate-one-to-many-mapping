package com.springboot_one_to_many_mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_one_to_many_mapping.entity.Comment;
import com.springboot_one_to_many_mapping.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;

	
	public Comment addOrUpdate(Comment comment) {
		
		return commentRepository.save(comment);
		
	}
	public boolean deleteById(int id)
	{
		 commentRepository.deleteById(id);;
		return true;
	}
	public List<Comment> getALL(){
		return commentRepository.findAll();
		
	}
	public Comment getById(int id)
	{
		return commentRepository.findById(id).get();
		
	}

}
