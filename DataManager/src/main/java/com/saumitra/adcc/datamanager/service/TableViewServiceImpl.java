package com.saumitra.adcc.datamanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saumitra.adcc.datamanager.entity.Lucknow;
import com.saumitra.adcc.datamanager.entity.TableView;
import com.saumitra.adcc.datamanager.jpa.LucknowRepo;
import com.saumitra.adcc.datamanager.jpa.TableViewRepo;

@Service
public class TableViewServiceImpl implements TableViewService{

	@Autowired
	private TableViewRepo repo;
	
	@Autowired
	private LucknowRepo lrepo;

	@Override
	public List<TableView> showContent() {
		return repo.findAll();
	}

	@Override
	public List<Lucknow> showLucknowData() {
		return lrepo.findAll();
	}
}
