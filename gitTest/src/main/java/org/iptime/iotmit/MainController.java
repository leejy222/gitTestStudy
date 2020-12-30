package org.iptime.iotmit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@GetMapping("/strcount")
	public void strcount() {
		
	}
	@PostMapping("/strcount")
	public String strcount1(Model model,String content) {
		model.addAttribute("count",content.replaceAll(" ","").length());
		System.out.println(content);
		return "strcount1";
	}

}
