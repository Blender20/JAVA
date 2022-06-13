package com.codingdojo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController
{
	@GetMapping("/")
	public String home
	(
		HttpSession session
	)
	{
		return "index";
	}
	
	@GetMapping("/show")
	public String show(Model model,HttpSession session)
	{
		Madlib madlib=new Madlib
		(
				(String)session.getAttribute("noun"),
				
		)
		
		
		
		
		String madlib="The "+adjective+" "+noun+" "+verb+".";
		
		model.addAttribute("madlib", madlib);
		return "show";
	}
	
	@PostMapping("/submit")
	public String process
	(
		@RequestParam("noun") String noun,
		@RequestParam("adjective") String adjective,
		@RequestParam("verb") String verb,
		HttpSession session
	)
	{
//		System.out.println(noun);
//		System.out.println(adjective);
//		System.out.println(verb);	
		
		session.setAttribute("noun", noun);
		session.setAttribute("adjective", adjective);
		session.setAttribute("verb", verb);
		
		
		return "redirect:/home";
		
	}
};