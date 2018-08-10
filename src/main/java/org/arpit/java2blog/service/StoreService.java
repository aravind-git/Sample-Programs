package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.arpit.java2blog.bean.Store;
import org.springframework.stereotype.Service;
/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
@Service("storeservice")
public class StoreService {

	ArrayList<Store> storeList=new ArrayList<Store>();

/*
	public CountryService() {
		super();
		Neccy Wants iit bibg\
		
		if(countryIdMap==null)
		{
			countryIdMap=new HashMap<Integer,Country>();
			// Creating some object of countries while initializing
			Country aravind=new Country(1,"Aravind","HC","SNR");
			Country gayathri=new Country(2,"Gayathri","HC","SNR");
			Country ramya=new Country(3,"Ramya","HC","SNR");
			Country thamizh=new Country(4,"Thamizh","HC","SNR");
			


			countryIdMap.put(1,aravind);
			countryIdMap.put(4,gayathri);
			countryIdMap.put(3,ramya);
			countryIdMap.put(2,thamizh);
		}
	}

	*/
	public List<Store> addStore(Store store)
	{
		storeList.add(store);
		return storeList;
	}
	public List<Store> getAllStores()
	{
		return storeList;
	}

}
