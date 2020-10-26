package com.packsendme.roadbrewa.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_transport")
public class Transport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_transport;
	public String initials;

	
	public Transport(String name_transport,String initials) {
		super();
		this.name_transport = name_transport;
		this.initials = initials;
	}


	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
