package com.cjc.Controller;

import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.Entity.Document;
import com.cjc.Service.DocumentService;

@RestController
@RequestMapping("/doc-api")
public class HomeController {
    @Autowired
	private DocumentService service; 
	
	@RequestMapping("/")
	public ResponseEntity<String> checkapp()
	{
		String msg="DocumentUploading App working Fine...!";
		return new ResponseEntity<String>(msg, HttpStatus.CHECKPOINT);
	}

	@PostMapping("/saveDoc")
	public ResponseEntity<String> saveDoc(@RequestPart MultipartFile f1,
			@RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3,
			@RequestPart MultipartFile f4) throws IOException
	{
		Document doc = new Document();
		doc.setPan(f1.getBytes());
		doc.setAdhar(f2.getBytes());
		doc.setVoterId(f3.getBytes());
		doc.setLicence(f4.getBytes());
		
		service.saveDoc(doc);
		
		String msg="Document Saved Successfull....!";
		return new ResponseEntity<String>("Document Saved Successfull....!" , HttpStatus.ACCEPTED);
		
	}
}
