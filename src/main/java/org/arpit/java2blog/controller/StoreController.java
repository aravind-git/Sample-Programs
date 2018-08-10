package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.bean.Store;
import org.arpit.java2blog.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StoreController {
	
	@Autowired
	StoreService storeservice;

	/*@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
		public List<Country> getCountries()
		{
			
			List<Country> listOfCountries=countryservice.getAllCountries();
			return listOfCountries;
		}
	*/
	@RequestMapping(value = "/store", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Store> getCountries()
	{
		
		List<Store> listOfCountries=storeservice.getAllStores();
		return listOfCountries;
	}
	@RequestMapping(value = "/store", method = RequestMethod.POST,headers="Accept=application/json")
	public List<Store> addStore(@RequestBody Store store)
	{
		return storeservice.addStore(store);
	}
/*
	@RequestMapping(value = "/countries", method = RequestMethod.PUT,headers="Accept=application/json")
	public Country updateCountry(Country country)
	{
		return countryservice.updateCountry(country);
		
	}*/
/*	@RequestMapping(value = "/countries{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Country getCountryById(@PathVariable  int id)
	{
		return countryservice.getCountry(id);
	}*/
	
	
	/*@RequestMapping(value = "/countries{id}", method = RequestMethod.DELETE,headers="Accept=application/json")
		public void deleteCountry(@PathVariable("id") int id)
		{
		countryservice.deleteCountry(id);
			
		}
		*/

	/*
	@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Country1> getCountries()
	{
		List<Country1> listOfCountries = new ArrayList<Country1>();
		listOfCountries=createCountryList();
		return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Country1 getCountryById(@PathVariable int id)
	{
		List<Country1> listOfCountries = new ArrayList<Country1>();
		listOfCountries=createCountryList();

		for (Country1 country: listOfCountries) {
			if(country.getId()==id)
				return country;
		}
		
		return null;
	}
*/
// Utiliy method to create country list.
	/*public List<Country> createCountryList()
	{
		Country aravind=new Country(1,"Aravind","HC","SNR");
		Country gayathri=new Country(2,"Gayathri","HC","SNR");
		Country ramya=new Country(3,"Ramya","HC","SNR");
		Country thamizh=new Country(4,"Thamizh","HC","SNR");
		

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(1,aravind);
		listOfCountries.add(4,gayathri);
		listOfCountries.add(3,ramya);
		listOfCountries.add(2,thamizh);

		
		
		return listOfCountries;
	}*/
}
