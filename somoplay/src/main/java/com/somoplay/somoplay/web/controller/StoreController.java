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
		logger.info("Creating store");
		Store store = new Store();
		storeService.save(store);
        return "redirect:/store/list";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(Model uiModel) {
		logger.info("delete store");
		Store store = new Store();
		store.setId(1l);
		storeService.delete(store);
        return "redirect:/store/list";
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model) {
		return "store/search";    
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam("searchtype") String searchtype, @RequestParam("content") String content, Model model) {
		List<Store> stores = new ArrayList<Store>();
		if(searchtype.equals("id"))
		{
			Store store = storeService.findById(new Long(content));
			stores.add(store);
		}
		else if(searchtype.equals("keyword"))
			stores = storeService.findByKeyword(content);
		else if(searchtype.equals("type"))
			stores = storeService.findByType(new Integer(content));
		else if(searchtype.equals("averageprice"))
			stores = storeService.findByAverage(new Integer(content));
		else if(searchtype.equals("distance"))
			stores = storeService.findByDistance(new Integer(content));
		model.addAttribute("entries", stores);
		logger.info("No. of entries: " + stores.size());
		
		return "store/list";    
	}
}
