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
@Document(collection = "pcks_roadbrewa_vehicle")
public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String vehicle_type;
	public List<String> bodywork_vehicle = new ArrayList<String>();
	public Double cargo_max;
	public Integer axis_total;
	public String unity_measurement_weight;
	public boolean transport_type;
	public String people;
	
	public Vehicle(String vehicle_type, List<String> bodywork_vehicle, Double cargo_max, Integer axis_total,
			String unity_measurement_weight, boolean transport_type, String people) {
		super();
		this.vehicle_type = vehicle_type;
		this.bodywork_vehicle = bodywork_vehicle;
		this.cargo_max = cargo_max;
		this.axis_total = axis_total;
		this.unity_measurement_weight = unity_measurement_weight;
		this.transport_type = transport_type;
		this.people = people;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
