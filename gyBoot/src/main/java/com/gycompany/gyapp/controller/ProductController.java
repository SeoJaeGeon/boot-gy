package com.gycompany.gyapp.controller;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/product")
public class ProductController {
	
	@RequestMapping(value = "/view")
	public String goList(Locale locale, Model model) {
		return "/product/view";
	}
	
}
