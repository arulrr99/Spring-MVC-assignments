package com.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.SI;

@Controller
public class UserController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView userLogin() {
		return new ModelAndView("login","command",new User());
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView loginValidate(@ModelAttribute("SpringWeb") User user) {
		String pass=user.getPassword();
		if("admin".equalsIgnoreCase(pass)) {
			return new ModelAndView("success","message","Success");
		}
		else {
			return new ModelAndView("error","message","Login error");
		}
		

	}


}
