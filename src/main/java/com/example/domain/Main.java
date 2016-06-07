package com.example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
	private String temp;
	@JsonProperty("temp_min")
	private String tempMin;
	@JsonProperty("temp_max")
	private String tempMax;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTempMin() {
		return tempMin;
	}

	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}

	public String getTempMax() {
		return tempMax;
	}

	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}

}
