package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Provider;

@RequestMapping("/provider")
@Controller
public class ProviderController {

	
	@RequestMapping("/list")
	//@ResponseBody
	public String providersList(Model m)
	{
		String provider = "Samsung";
		ArrayList<String> providers = new ArrayList<>();
		providers.add("Samsung");
		providers.add("HP");
		providers.add("Dell");
		
		
		ArrayList<Provider> objs = new ArrayList<>();
		objs.add(new Provider("Samsung","Korea","samsung@gmail.com"));
		objs.add(new Provider("HP","USA","hp@hotmail.com"));
		objs.add(new Provider("Dell","USA","dell@hotmail.com"));
		
		m.addAttribute("pr", provider);
		m.addAttribute("providers",providers);
		m.addAttribute("objs",objs);
		
		
		return "provider/listProviders";   // on place le nom de la vue
	}
	
	@GetMapping("add")
	public String addProviderGet()
	{
		return "provider/addProvider";
	}
	@PostMapping("add")
	@ResponseBody
	public String addProviderPost()
	{
		// ici on va ajouter un nouveau provider dans la liste
		return "PageInsrtion";
	}
	
	
	
	
	
	
	
	
	
}
