package com.revature.springbootstarter.actual;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/posts")
	public List<Post> getFeed() {
		System.out.println("You have arrived!");
		// Citing Source here:
		// https://www.youtube.com/watch?v=FeU24_8JhEs&index=13&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x
		return Arrays.asList(new Post("If you're hotter than me that means I'm cooler than u "),
				new Post("People said follow your dreams, so I went back to bed. "),
				new Post("Vegetarian. Ancient tribal slang for the villiage idiot who can't hunt, fish, or ride "));
	}
}
