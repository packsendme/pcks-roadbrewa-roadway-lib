package com.packsendme.roadbrewa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@Document(collection = "pcks_roadbrewa_category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name_category;
	public String initials;
	public String transport;
	public Double weight_max;
	public Integer people_max;
	public Map<Integer, String> unity_weight = new HashMap<Integer, String>();
	public List<Vehicle> vehicles = new ArrayList<Vehicle>(); 
	public Date dt_inc;
	public Date dt_update;
	

	public Category(String name_category, String initials, String transport, Double weight_max, Integer people_max,
			Map<Integer, String> unity_weight, List<Vehicle> vehicles, Date dt_inc, Date dt_update) {
		super();
		this.name_category = name_category;
		this.initials = initials;
		this.transport = transport;
		this.weight_max = weight_max;
		this.people_max = people_max;
		this.unity_weight = unity_weight;
		this.vehicles = vehicles;
		this.dt_inc = dt_inc;
		this.dt_update = dt_update;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
