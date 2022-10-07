package com.springboot_one_to_many_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_one_to_many_mapping.entity.Comment;
import com.springboot_one_to_many_mapping.service.CommentService;

@RestController
@RequestMapping("/request")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@GetMapping("/getcomment")
	private List<Comment> getAll(){
		return commentService.getALL();
		
	}
	@GetMapping("/{id}")
	private Comment getById(@PathVariable int id) {
		return commentService.getById(id);
		
	}
	@PostMapping("posting")
	private Comment add(@RequestBody Comment comment) {
		return commentService.addOrUpdate(comment);
		
	}
	@PutMapping("/{id}")
	private Comment update(@PathVariable int id,@RequestBody Comment comment) {
		return commentService.addOrUpdate(comment);
		
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id) {
		 commentService.deleteById(id);
		
	}

}
