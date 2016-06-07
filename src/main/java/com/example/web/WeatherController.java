package com.example.web;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.domain.City;
import com.example.domain.WeatherResponse;

@Controller
public class WeatherController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String weather(ModelMap model) {
		City city = new City();
		model.put("city", city);
		return "weather";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String weatherPost(@ModelAttribute City city, ModelMap model) throws URISyntaxException {
		String strAPIKey = "6d4e491f898a21e384b02c995b3c8c6f";
		String strURI = "http://api.openweathermap.org/data/2.5/weather?q=" + city.getName() + "&units=metric&appid="
				+ strAPIKey;
		WeatherResponse weatherResponse = null;
		if (!(city.getName().equalsIgnoreCase("Select"))) {
			URI uri = new URI(strURI);
			RestTemplate template = new RestTemplate();
			RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET, uri);
			weatherResponse = template.exchange(uri, HttpMethod.GET, request, WeatherResponse.class).getBody();
		}

		model.put("weatherResponse", weatherResponse);
		model.put("city", city);
		return "weather";
	}
}
