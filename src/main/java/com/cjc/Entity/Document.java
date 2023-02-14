package com.cjc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Lob
	private byte[] pan;
	@Lob
	private byte[] adhar;
	@Lob
	private byte[] voterId;
	@Lob
	private byte[] licence;

}
