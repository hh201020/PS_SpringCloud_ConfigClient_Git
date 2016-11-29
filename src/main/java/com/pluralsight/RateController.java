package com.pluralsight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
	
	@Value("${rate}")
	String rate;
	
	@Value("${lanecount}")
	String laneCount;
		
	@Value("${tollstart}")
	String tollStart;
	
	@Value("${connstring}")
	String connstring;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rate", rate);
		m.addAttribute("laneCount", laneCount);
		m.addAttribute("tollStart", tollStart);
		m.addAttribute("connstring", connstring);
	
		return "rateview";
	}
}
