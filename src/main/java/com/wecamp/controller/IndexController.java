package com.wecamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class IndexController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String index() {
		return "index";
	}
}