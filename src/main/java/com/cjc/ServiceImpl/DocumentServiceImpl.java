package com.cjc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Dao.DocumentRepo;
import com.cjc.Entity.Document;
import com.cjc.Service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService 
{
	@Autowired
	private DocumentRepo repo;

	@Override
	public void saveDoc(Document doc) {
		
		
		repo.save(doc);
		
	}

}
