package com.springboot.mycgv.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyCgvController {
	
	@GetMapping("/mycgv")
	public String mycgv() {
		return "/mycgv/mycgv";
	}

}
