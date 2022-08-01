package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Add annotations here
 */

// TODO ハンズオン
@Controller
@RequestMapping("/sample")
// TODO ハンズオン
public class SampleController {
	
// 	private final JdbcTemplate jdbcTemplate;

// 	//Add an annotation here 
// 	public SampleController(JdbcTemplate jdbcTemplate) {
// 		this.jdbcTemplate = jdbcTemplate;
// 	}

	// TODO ハンズオン
	@GetMapping("/test")
	public String index(Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "test";
	}
	// TODO ハンズオン

	@GetMapping
	public String test(Model model) {
		
		//hands-on

		return "test";
	}

}
