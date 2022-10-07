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

import com.springboot_one_to_many_mapping.entity.Post;
import com.springboot_one_to_many_mapping.service.PostService;

@RestController
@RequestMapping("/posting")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping("/getpost")
	private List<Post> getAll(){
		return postService.getALL();
		
	}
	@GetMapping("/{id}")
	private Post getById(@PathVariable int id) {
		return postService.getById(id);
		
	}
	@PostMapping("/add")
	private Post add(@RequestBody Post Post) {
		return postService.addOrUpdate(Post);
		
	}
	@PutMapping("/{id}")
	private Post update(@PathVariable int id,@RequestBody Post Post) {
		return postService.addOrUpdate(Post);
		
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id) {
		 postService.deleteById(id);
		
	}
}
