package com.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController
{
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("/submit")
	public String process
	(
		@RequestParam("noun") String noun,
		@RequestParam("adjective") String adjective,
		@RequestParam("verb") String verb	
	)
	{
		System.out.println(noun);
		System.out.println(adjective);
		System.out.println(verb);
		return "redirect:/home";
		
	}
};