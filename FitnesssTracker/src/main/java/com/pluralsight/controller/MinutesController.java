package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="addMinutes")
	public String addMin(@ModelAttribute("exercise") Exercise exer){
		System.out.println("Exer:::  "+exer.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> lst = new ArrayList<Activity>();
		
		Activity act1= new Activity();
		act1.setDesc("Run");
		lst.add(act1);
		
		Activity act2= new Activity();
		act2.setDesc("Jump");
		lst.add(act2);
		
		Activity act3= new Activity();
		act3.setDesc("Walk");
		lst.add(act3);
		
		Activity act4= new Activity();
		act4.setDesc("Swim");
		lst.add(act4);
		
		return lst;
	}
}
