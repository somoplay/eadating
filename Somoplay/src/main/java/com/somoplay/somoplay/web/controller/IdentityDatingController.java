package com.somoplay.somoplay.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.somoplay.somoplay.domain.IdentityDating;
import com.somoplay.somoplay.service.IdentityDatingService;

@RequestMapping("/identityDating")
@Controller
public class IdentityDatingController  {
	
	final Logger logger = LoggerFactory.getLogger(IdentityDatingController.class);
	
	@Autowired
	private IdentityDatingService identityDatingService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model uiModel) {
		logger.info("Listing blog entries");
		
		List<IdentityDating> entries = identityDatingService.findAll();
		uiModel.addAttribute("entries", entries);
		
		logger.info("No. of entries: " + entries.size());
		
		return "identityDating/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model uiModel) {
		logger.info("Creating entry");
		IdentityDating entry = new IdentityDating();
		identityDatingService.save(entry);
        return "redirect:/identityDating/list";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Model uiModel) {
		logger.info("delete entry");
		IdentityDating entry = new IdentityDating();
		entry.setId(1l);
		identityDatingService.delete(entry);
        return "redirect:/identityDating/list";
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model) {
		return "identityDating/search";    
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam("searchtype") String searchtype, @RequestParam("content") String content, Model model) {
		List<IdentityDating> entries = new ArrayList<IdentityDating>();
		if(searchtype.equals("id"))
		{
			IdentityDating entry = identityDatingService.findById(new Long(content));
			entries.add(entry);
		}
		else if(searchtype.equals("keyword"))
			entries = identityDatingService.findByKeyword(content);
		else if(searchtype.equals("type"))
			entries = identityDatingService.findByType(new Integer(content));
		else if(searchtype.equals("distance"))
			entries = identityDatingService.findByDistance(new Integer(content));
		model.addAttribute("entries", entries);
		logger.info("No. of entries: " + entries.size());
		
		return "identityDating/list";    
	}
}