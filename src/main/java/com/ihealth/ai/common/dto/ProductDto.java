package com.ihealth.ai.common.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
	
	private static final long serialVersionUID = -1381897574619436107L;

	private String id;
	private Double score;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Double getScore() {
		return score;
	}
	
	public void setScore(Double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "ProductDto{" +
			"id='" + id + '\'' +
			", score=" + score +
			'}';
	}
}