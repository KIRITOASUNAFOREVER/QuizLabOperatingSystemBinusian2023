
public class DrinkList {
	String drinkType;
	String drinkName;
	String drinkTemperature;
	int drinkSugarAmount;
	int drinkBasePrice;
	int drinkLeavesWeight;
	String drinkBobaTopping;
	int finalPrice;
	
	public DrinkList(String drinkType, String drinkName, String drinkTemperature, int drinkSugarAmount,
			int drinkBasePrice, int drinkLeavesWeight, String drinkBobaTopping, int finalPrice) {
		super();
		this.drinkType = drinkType;
		this.drinkName = drinkName;
		this.drinkTemperature = drinkTemperature;
		this.drinkSugarAmount = drinkSugarAmount;
		this.drinkBasePrice = drinkBasePrice;
		this.drinkLeavesWeight = drinkLeavesWeight;
		this.drinkBobaTopping = drinkBobaTopping;
		this.finalPrice = finalPrice;
	}
	
	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getDrinkType() {
		return drinkType;
	}
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public String getDrinkTemperature() {
		return drinkTemperature;
	}
	public void setDrinkTemperature(String drinkTemperature) {
		this.drinkTemperature = drinkTemperature;
	}
	public int getDrinkSugarAmount() {
		return drinkSugarAmount;
	}
	public void setDrinkSugarAmount(int drinkSugarAmount) {
		this.drinkSugarAmount = drinkSugarAmount;
	}
	public int getDrinkBasePrice() {
		return drinkBasePrice;
	}
	public void setDrinkBasePrice(int drinkBasePrice) {
		this.drinkBasePrice = drinkBasePrice;
	}
	public int getDrinkLeavesWeight() {
		return drinkLeavesWeight;
	}
	public void setDrinkLeavesWeight(int drinkLeavesWeight) {
		this.drinkLeavesWeight = drinkLeavesWeight;
	}
	public String getDrinkBobaTopping() {
		return drinkBobaTopping;
	}
	public void setDrinkBobaTopping(String drinkBobaTopping) {
		this.drinkBobaTopping = drinkBobaTopping;
	}
}
