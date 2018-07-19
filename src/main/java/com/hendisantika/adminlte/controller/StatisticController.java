package com.hendisantika.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatisticController {

	@RequestMapping(value="/statistics")
	public String index(){
		return "/statistics/list";
	}
	
}
