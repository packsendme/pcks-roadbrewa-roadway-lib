package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(collection = "pcks_roadbrewa_vehicletype")
public class VehicleType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;	
	public String type_vehicle;
	public String vehicle_model;
	public List<String> vehicle_category = new ArrayList<String>();
	
	public VehicleType(String type_vehicle, String vehicle_model, List<String> vehicle_category) {
		super();
		this.type_vehicle = type_vehicle;
		this.vehicle_model = vehicle_model;
		this.vehicle_category = vehicle_category;
	}

	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	