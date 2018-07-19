package com.hendisantika.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * A classe ficou em português por ter dado conflito com uma classe em inglês do spring
 * @author armandosoaressousa
 *
 */
@Controller
public class RepositorioController {
	
	@RequestMapping(value="/repositories")
	public String index(){
		return "repositories/list";
	}


}
