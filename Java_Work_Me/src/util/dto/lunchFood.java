package util.dto;

import java.time.LocalDate;

public class lunchFood {
	private String foodName;
	private int foodPrice;
	private String foodRegDate;
	private String foodmodDate;
	private String location;
	
	
	public lunchFood(String foodName, int foodPrice, String foodRegDate, String foodmodDate, String location) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodRegDate = foodRegDate;
		this.foodmodDate = foodmodDate;
		this.location = location;
	}


	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodRegDate() {
		return foodRegDate;
	}
	public void setFoodRegDate(String foodRegDate) {
		this.foodRegDate = foodRegDate;
	}
	public String getFoodmodDate() {
		return foodmodDate;
	}
	public void setFoodmodDate(String foodmodDate) {
		this.foodmodDate = foodmodDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "lunchFood [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodRegDate=" + foodRegDate
				+ ", foodmodDate=" + foodmodDate + ", location=" + location + "]";
	}
	
	
}
