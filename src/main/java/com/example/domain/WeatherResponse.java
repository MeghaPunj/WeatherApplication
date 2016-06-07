package com.example.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WeatherResponse {
	private String dt;
	private String name;
	private String cod;
	private Main main;
	private List<Weather> weather;
	private Wind wind;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public String getDt() {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date dt = new Date();
		return dateformat.format(dt);
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

}
