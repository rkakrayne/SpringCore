package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal(Model model){
		Goal  g =  new Goal();
		g.setMinutes(10);
		model.addAttribute("goal",g);
		return "addGoal";
	}
	
	@RequestMapping(value="addGoal", method=RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal,BindingResult res){
		System.out.println("Errors:  "+res.hasErrors());
		if(res.hasErrors()){
			return "addGoal";
		}
		
		System.out.println("Minutes updated:"+goal.getMinutes());
		return "redirect:addMinutes.html";
	}
}
