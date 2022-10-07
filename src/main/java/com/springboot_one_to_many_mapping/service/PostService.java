package com.springboot_one_to_many_mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_one_to_many_mapping.entity.Post;
import com.springboot_one_to_many_mapping.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public Post addOrUpdate(Post post) {
		
		return postRepository.save(post);
		
	}
	public boolean deleteById(int id)
	{
		 postRepository.deleteById(id);;
		return true;
	}
	public List<Post> getALL(){
		return postRepository.findAll();
		
	}
	public Post getById(int id)
	{
		return postRepository.findById(id).get();
		
	}

}
