package com.saumitra.adcc.datamanager.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saumitra.adcc.datamanager.entity.Lucknow;

@Repository
public interface LucknowRepo extends JpaRepository<Lucknow, String>{

}
