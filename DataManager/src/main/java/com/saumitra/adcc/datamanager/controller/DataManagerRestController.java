package com.saumitra.adcc.datamanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saumitra.adcc.datamanager.entity.Lucknow;
import com.saumitra.adcc.datamanager.entity.TableView;
import com.saumitra.adcc.datamanager.service.TableViewService;

@RestController
@RequestMapping("/api")
public class DataManagerRestController {
	
	@Autowired
	private TableViewService service;
	
	@RequestMapping(value="/listDistricts", produces = { "application/json" }, method=RequestMethod.GET)
	public List<TableView> getContent(){
		return service.showContent();
	}
	
	@RequestMapping(value="/listLucknowData",  produces = { "application/json" }, method=RequestMethod.GET)
	public List<Lucknow> getLucknowContent(){
		return service.showLucknowData();
	}

}
