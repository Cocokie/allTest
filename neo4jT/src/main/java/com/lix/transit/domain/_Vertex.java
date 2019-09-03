package com.lix.transit.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class _Vertex {
	public String type;
	public String name;
	public String identity;
	
	@JsonCreator
	public _Vertex(@JsonProperty("type") String label, 
			@JsonProperty("name") String name, 
			@JsonProperty("identity") String identity) {
		this.type = label;
		this.name = name;
		this.identity = identity;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s", type, name, identity);
	}
}
