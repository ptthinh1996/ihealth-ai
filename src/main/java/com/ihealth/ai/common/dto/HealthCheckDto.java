package com.ihealth.ai.common.dto;

import com.ihealth.ai.common.BaseDto;

import java.io.Serializable;

public class HealthCheckDto extends BaseDto implements Serializable {

    private static final long serialVersionUID = -4713228468785959182L;

	private String message;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HealthCheckDto{" +
				"message='" + message + '\'' +
				'}';
	}
}