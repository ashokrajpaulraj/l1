package com.hcl.gl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myapp")
public class MainController {

	@ResponseBody
	@GetMapping("/home")
	public String home() {
		return "<h1>Home page</h1>";
	}
	
}
