package RESTAPI.RetailManager.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import RESTAPI.RetailManager.model.Shop;
import RESTAPI.RetailManager.service.ShopService;

@Path("/getShopDetails")
public class ShopResource {

	ShopService shopService = new ShopService();
	
	// This Would return all the shops
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Shop> getmessages(){
		return shopService.getAllShops();
	}
	
	// This would return shop by name
	@GET
	@Path("/{shopName}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Shop getmessage(@PathParam("shopName") String shopName){
		return shopService.getShop(shopName);
	}
		
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Shop addShopDetails(Shop shop){
		return shopService.addShopDetails(shop);			
	}
	
}
