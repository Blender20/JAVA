package com.codingdojo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController 
{
	@GetMapping("/")
	public String index
	(
		Model model
	)
	{
		ArrayList<Item> items=new ArrayList<Item>();
		items.add(new Item("watermelon",3.99));
		items.add(new Item("bananas",2.80));
		items.add(new Item("apple",1.19));
		items.add(new Item("broccoli",3.99));
		items.add(new Item("carrot",1.50));
	
		model.addAttribute("cart",items);
		return "index";
	}
};
