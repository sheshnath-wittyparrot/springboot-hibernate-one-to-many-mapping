package com.springboot_one_to_many_mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot_one_to_many_mapping.entity.Comment;
import com.springboot_one_to_many_mapping.entity.Post;
import com.springboot_one_to_many_mapping.repository.PostRepository;
@AutoConfiguration
@SpringBootApplication
public class SpringbootHibernateOneToManyMappingApplication 
//implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyMappingApplication.class, args);
	}
//	@Autowired
//	private PostRepository postRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Post post=new Post("first one to many project","Now it is running");
//		
//		Comment comment1=new Comment("Shesh");
//		Comment comment2=new Comment("Amit");
//		Comment comment3=new Comment("Parth");
//		Comment comment4=new Comment("Yashwant");
//		
//		post.getComments().add(comment1);
//		post.getComments().add(comment2);
//		post.getComments().add(comment3);
//		post.getComments().add(comment4);
//		
//		this.postRepository.save(post);
//	}

}
