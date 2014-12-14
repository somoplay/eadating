/**
 * Created on Dec 12, 2011
 */
package com.somoplay.somoplay.web.restful.controller;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.somoplay.somoplay.domain.Store;
import com.somoplay.somoplay.service.StoreService;

/**
 * @author Jing
 *
 */
@Controller
@RequestMapping(value="/store")
public class StoreRestfulController {

	final Logger logger = LoggerFactory.getLogger(StoreRestfulController.class);
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String listData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Store> stores = storeService.findAll();
		
		
		JsonFactory f = new JsonFactory();
		OutputStream out = new ByteArrayOutputStream();
		JsonGenerator g = f.createJsonGenerator(out);
		for ( Store store: stores ) {
		   g.writeStartObject();
		   g.writeStringField("store_id", store.getId().toString());
		   g.writeStringField("nameEn", store.getNameEn());
//		   g.writeObjectFieldStart("name");
//		   g.writeStringField("first", "Joe");
//		   g.writeStringField("last", "Sixpack");
//		   g.writeEndObject(); // for field 'name'
//		   g.writeStringField("gender", "male");
//		   g.writeBooleanField("verified", false);
		   g.writeEndObject();
		}
		   g.close(); // important: will force flushing of output, close underlying output stream

		 System.out.print(out.toString());


		
//		JsonView.Render(user, response);
//		System.out.println("Recieved message: " + message);
		return out.toString();
		//return new Stores(storeService.findAll());
	}
	
}
