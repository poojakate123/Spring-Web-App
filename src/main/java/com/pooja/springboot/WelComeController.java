package com.pooja.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller used For welcome page
@Controller
@RestController
public class WelComeController {
	
	@GetMapping("/message")
	
	public String welcome(Model model)
	{	
		model.addAttribute("message", "Hello World");
		return "Welcome to MVC : Shut your mouth";
	}

}
