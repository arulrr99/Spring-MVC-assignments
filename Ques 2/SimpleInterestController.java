package com.si;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping(value="/simpleinterest",method=RequestMethod.GET)
	public ModelAndView calculateSi() {
		return new ModelAndView("siInput","command",new SI());	
	}
	
	@RequestMapping(value = "/silogic", method = RequestMethod.POST)
    public ModelAndView silogic(@ModelAttribute("SpringWeb") SI s, ModelMap model) {
       
       float s1 = (s.getP()*s.getR()*s.getT())/100;
       return new ModelAndView("siresult","res",s1);
     }

}
