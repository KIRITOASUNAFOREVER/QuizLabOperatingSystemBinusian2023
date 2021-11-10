
public class FoodList {
	String foodType;
	String foodName;
	int foodQuantity;
	int foodCalories;
	String foodNutrient;
	int foodSugar;
	double currentWeight;
	double currentHealth;
	double finalWeight;
	double finalHealth;
	double diffWeight;
	double diffHealth;
	
	
	public FoodList(String foodType, String foodName, int foodQuantity, int foodCalories, String foodNutrient,
			int foodSugar, double currentWeight, double currentHealth, double finalWeight, double finalHealth,
			double diffWeight, double diffHealth) {
		super();
		this.foodType = foodType;
		this.foodName = foodName;
		this.foodQuantity = foodQuantity;
		this.foodCalories = foodCalories;
		this.foodNutrient = foodNutrient;
		this.foodSugar = foodSugar;
		this.currentWeight = currentWeight;
		this.currentHealth = currentHealth;
		this.finalWeight = finalWeight;
		this.finalHealth = finalHealth;
		this.diffWeight = diffWeight;
		this.diffHealth = diffHealth;
	}
	public double getDiffWeight() {
		return diffWeight;
	}
	public void setDiffWeight(double diffWeight) {
		this.diffWeight = diffWeight;
	}
	public double getDiffHealth() {
		return diffHealth;
	}
	public void setDiffHealth(double diffHealth) {
		this.diffHealth = diffHealth;
	}
	public double getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}
	public double getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	public double getFinalWeight() {
		return finalWeight;
	}
	public void setFinalWeight(double finalWeight) {
		this.finalWeight = finalWeight;
	}
	public double getFinalHealth() {
		return finalHealth;
	}
	public void setFinalHealth(double finalHealth) {
		this.finalHealth = finalHealth;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	public int getFoodCalories() {
		return foodCalories;
	}
	public void setFoodCalories(int foodCalories) {
		this.foodCalories = foodCalories;
	}
	public String getFoodNutrient() {
		return foodNutrient;
	}
	public void setFoodNutrient(String foodNutrient) {
		this.foodNutrient = foodNutrient;
	}
	public int getFoodSugar() {
		return foodSugar;
	}
	public void setFoodSugar(int foodSugar) {
		this.foodSugar = foodSugar;
	}
}
