package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {
	@RequestMapping("/fortune")
	public String start() {
		double fn1 = Math.random();
        if(fn1 >= 0.7) {
            return "greatFortune.html";
        } else if(fn1 >= 0.4) {
            return "middleFortune.html";
        } else if(fn1 >= 0.1) {
            return "smallFortune.html";
        } else {
            return "misfortune.html";
        }
	}
}
