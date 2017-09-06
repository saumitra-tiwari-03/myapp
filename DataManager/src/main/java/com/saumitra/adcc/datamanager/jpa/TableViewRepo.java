package com.saumitra.adcc.datamanager.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saumitra.adcc.datamanager.entity.TableView;

@Repository
public interface TableViewRepo extends JpaRepository<TableView, Integer>{

}
