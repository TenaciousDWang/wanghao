package com.wanghao.editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editor")
public class editorController {
	
	@RequestMapping("/index")
	public String editor() {
		return "wangeditor3/editor";
	}

}