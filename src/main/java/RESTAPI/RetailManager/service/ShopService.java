package RESTAPI.RetailManager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import RESTAPI.RetailManager.database.DatabaseClass;
import RESTAPI.RetailManager.exception.DataNotFoundException;
import RESTAPI.RetailManager.model.Shop;

public class ShopService {

	private Map<String,Shop> shopsMap = DatabaseClass.getShopsMap();
	
	public ShopService(){
		shopsMap.put("Bakery",new Shop("Bakery","Wakad",411057,10.2,20.4));
		shopsMap.put("Dmart",new Shop("Dmart","Hinjewadi",411057,20.6,30.8));
		shopsMap.put("Relaince Digital",new Shop("Relaince Digital","Baner",411058,11.1,33.5));
	}
	
	// This will return all the Shops mapped in the DatabaseHashmap
		public List<Shop> getAllShops(){	
			return new ArrayList<Shop>(shopsMap.values());
		}
		
	// This will return an individual shop on basis of its Name	
		public Shop getShop(String shopName){
			Shop shop= shopsMap.get(shopName);
			if(shop == null){
				throw new DataNotFoundException("This ShopName - " + shopName + " doesn't exists in Database!");
			}
			return shopsMap.get(shopName);
		}
	
	// This method will add the ShopDetails at Runtime
		public Shop addShopDetails(Shop shop){
			shopsMap.put(shop.getShopName(),shop);
			return shop;
			
		}
		
		
	// This will return all the Shops between longitude and latitude
	/*	public List<Shop> getAllShopsLongAndLati(Long longitude,Long lattitude){
			for(Entry<String, Shop> entry : shopsMap.entrySet() ){

			}
			
		//	long l1 = shopsMap.get
			
			return new ArrayList<Shop>(shopsMap.values());
		}	
		
		*/
}
