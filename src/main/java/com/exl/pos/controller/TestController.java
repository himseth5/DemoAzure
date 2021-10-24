package com.exl.pos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/**")
public class TestController {
	
	@GetMapping("users")
	public List<String> getUsers() {
		List<String> users = new ArrayList<String>();
		
		for(int i =0 ; i < 5; i++) {
			users.add("User_" + i);
		}
		
		users.add("him");
		return users;
	}

}
