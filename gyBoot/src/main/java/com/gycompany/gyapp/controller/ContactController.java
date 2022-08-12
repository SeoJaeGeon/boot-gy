package com.gycompany.gyapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gycompany.gyapp.HomeController;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {
	
	@RequestMapping(value = "/view")
	public String home(Locale locale, Model model) {
		return "contact/view";
	}
	
}
