package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Pojo.Userdetails;

@Controller
public class Indexcontroller {
	@RequestMapping("index")
	public ModelAndView test(Userdetails ud) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("details",ud);
		mav.setViewName("index");
		return mav;
	}
}
