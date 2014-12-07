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

import com.somoplay.somoplay.domain.Store;
import com.somoplay.somoplay.service.StoreService;


@RequestMapping("/store")
@Controller
public class StoreController {
	
	final Logger logger = LoggerFactory.getLogger(StoreController.class);
	
	@Autowired
	private StoreService storeService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model uiModel) {
		logger.info("Listing blog entries");
		
		List<Store> entries = storeService.findAll();
		uiModel.addAttribute("entries", entries);
		
		logger.info("No. of entries: " + entries.size());
		
		return "store/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model uiModel) {
		logger.info("Creating entry");
		Store entry = new Store();
		storeService.save(entry);
        return "redirect:/store/list";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Model uiModel) {
		logger.info("delete entry");
		Store entry = new Store();
		entry.setId(1l);
		storeService.delete(entry);
        return "redirect:/store/list";
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model) {
		return "store/search";    
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam("searchtype") String searchtype, @RequestParam("content") String content, Model model) {
		List<Store> entries = new ArrayList<Store>();
		if(searchtype.equals("id"))
		{
			Store entry = storeService.findById(new Long(content));
			entries.add(entry);
		}
		else if(searchtype.equals("keyword"))
			entries = storeService.findByKeyword(content);
		else if(searchtype.equals("type"))
			entries = storeService.findByType(new Integer(content));
		else if(searchtype.equals("averageprice"))
			entries = storeService.findByAverage(new Integer(content));
		else if(searchtype.equals("distance"))
			entries = storeService.findByDistance(new Integer(content));
		model.addAttribute("entries", entries);
		logger.info("No. of entries: " + entries.size());
		
		return "store/list";    
	}
}
