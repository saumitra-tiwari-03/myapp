package com.saumitra.adcc.datamanager.service;

import java.util.List;

import com.saumitra.adcc.datamanager.entity.Lucknow;
import com.saumitra.adcc.datamanager.entity.TableView;

public interface TableViewService {
	
	public List<TableView> showContent();
	
	public List<Lucknow> showLucknowData();

}
