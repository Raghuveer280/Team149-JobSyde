package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class AppController {
	@GetMapping("/")
	public String index(HttpSession session,Model m)
	{
		String phn=(String)session.getAttribute("username");
		if(phn!=null)
		{
			m.addAttribute("logged", "login");
		}
		return "index";
	}
	@GetMapping("/home")
	public String home(HttpSession session,Model m)
	{
		String phn=(String)session.getAttribute("username");
		if(phn!=null)
			m.addAttribute("logged","login");
		return "home";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/serviceLogin")
	public String serviceLogin()
	{
		return "serviceLogin";
	}
	@GetMapping("/createprofile")
	public String createprofile()
	{
		return "createprofile";
	}
	@GetMapping("/customerRegistration")
	public String customerRegistration()
	{
		return "customerRegistration";
	}
	@GetMapping("/logout")
	public void logout(HttpSession session)
	{
		session.invalidate();
	}
	@GetMapping("/hire")
	public String hire()
	{
		return "hire";
	}
	@GetMapping("/contact1")
	public String contact1()
	{
		return "contact1";
	}
	
	@GetMapping("/postjob")
	public String postjob()
	{
		return "postjob";
	}
	
}
