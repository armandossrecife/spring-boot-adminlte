package com.hendisantika.adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessControlController {

    @RequestMapping(value="/accesscontrol")
    public String index() {
        return "accesscontrol/list";
    }
	
}
