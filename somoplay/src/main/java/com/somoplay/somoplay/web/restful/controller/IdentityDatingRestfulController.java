package com.somoplay.somoplay.web.restful.controller;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.somoplay.somoplay.domain.IdentityDating;
import com.somoplay.somoplay.domain.Images;
import com.somoplay.somoplay.domain.User;
import com.somoplay.somoplay.service.IdentityDatingService;


@Controller
@RequestMapping(value="/identitydating")
public class IdentityDatingRestfulController {
final Logger logger = LoggerFactory.getLogger(IdentityDatingRestfulController.class);
	
	@Autowired
	private IdentityDatingService identityDatingService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String listData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<IdentityDating> identityDatings = identityDatingService.findAll();
		
		
		JsonFactory f = new JsonFactory();
		OutputStream out = new ByteArrayOutputStream();
		JsonGenerator g = f.createJsonGenerator(out);
		
		JSONArray identityDatingArray = new JSONArray();
		 
		for ( IdentityDating identityDating: identityDatings ) {
		   g.writeStartObject();
		   g.writeStringField("identityDating_id", identityDating.getId().toString());
		   g.writeStringField("displayName", identityDating.getDisplayName() );
		   g.writeEndObject();
	
		   JSONObject identityDatingObject = new JSONObject();
		   identityDatingObject.put("identityDating_id", identityDating.getId().toString());
		   identityDatingObject.put("displayName",  identityDating.getDisplayName());
		   
		   
		   Set <Images> images = identityDating.getImages();
		   JSONArray imagesJsonArray = new JSONArray();
		   for(Images image:images)
		   {
			   g.writeStartObject();
			   g.writeStringField("image_name", image.getName());
			   g.writeStringField("size_type", image.getSizeType() );
			   g.writeEndObject();
			   
			   JSONObject imageObject = new JSONObject();
			   imageObject.put("image_name", image.getName());
			   imageObject.put("size_type",  image.getSizeType());
			   imagesJsonArray.put(imageObject);
		   }
		   identityDatingObject.put("images",  imagesJsonArray);
		   
		   identityDatingArray.put(identityDatingObject);
		   
		}
		
		g.close(); // important: will force flushing of output, close underlying output stream
		 //System.out.print(out.toString());
		return identityDatingArray.toString();
	}
	
	

}
