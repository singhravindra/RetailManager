package RESTAPI.RetailManager.database;

import java.util.HashMap;
import java.util.Map;

import RESTAPI.RetailManager.model.Shop;

public class DatabaseClass {

	private static Map<String,Shop> shopsMap = new HashMap<>();

	public static Map<String, Shop> getShopsMap() {
		return shopsMap;
	}
	
}
