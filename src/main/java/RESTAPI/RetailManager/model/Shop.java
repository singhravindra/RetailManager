package RESTAPI.RetailManager.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Shop {

	private String shopName;
	private String shopAddress;
	private long shopPostal;
	private Date shopCreated;
	
	private Double shopLongitude;
	private Double shopLattitude;
	
	public Shop() {
	}


	public Shop(String shopName, String shopAddress, long shopPostal, Double shopLongitude, Double shopLattitude) {
		super();
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopPostal = shopPostal;
		this.shopLongitude = shopLongitude;
		this.shopLattitude = shopLattitude;
		this.shopCreated = new Date();
	}
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public long getShopostal() {
		return shopPostal;
	}
	public void setShopostal(long shopostal) {
		this.shopPostal = shopostal;
	}
	public Date getShopCreated() {
		return shopCreated;
	}
	public void setShopCreated(Date shopCreated) {
		this.shopCreated = shopCreated;
	}
	public Double getShopLongitude() {
		return shopLongitude;
	}
	public void setShopLongitude(Double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	public Double getShopLattitude() {
		return shopLattitude;
	}
	public void setShopLattitude(Double shopLattitude) {
		this.shopLattitude = shopLattitude;
	}
	
	
}
