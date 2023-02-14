package com.cjc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.Entity.Document;


public interface DocumentRepo extends JpaRepository<Document, Integer>  {

}
