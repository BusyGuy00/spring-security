package org.green.contoller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("접근 거부 : " + auth);
		model.addAttribute("msg" , "접근 거부");
	}
	@GetMapping("/customLogin")
	public void ioginInput(String error, String logout, Model model) {
		log.info("에러 : " + error);
		log.info("로그아웃 : " + logout);
		
		//값이 있을 경우 
		if(error != null) {
			model.addAttribute("error","로그인오류");
		}
		if(logout != null) {
			model.addAttribute("logout","로그아웃~!");
		}		
	}
	@GetMapping("/customLogout")
	public void logoutGet() {
		log.info("로그아웃");
	}
}
	