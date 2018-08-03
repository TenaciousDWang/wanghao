package com.wanghao.bootstrapCalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bootstrapCalendar")
public class BootstrapCalendarController {
	
	@RequestMapping("/index")
	public String bootstrapCalendar() {
		return "bootstrapCalendar/bootstrapCalendar-index";
	}

}