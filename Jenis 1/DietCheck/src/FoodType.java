import java.util.Scanner;

abstract class FoodType {
	String foodType;
	String foodName;
	int foodQuantity;
	int foodCalories;
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
	
	private boolean validateName(String name){
        if (name.length() > 4 && name.length() < 20){
            return true;
        }
        return false;
    }
	
	void inputFoodName(Scanner scanner){
		do{
			System.out.print("Input food name [4-20 characters] >> ");
			foodName = scanner.nextLine();
		}while(!validateName(foodName));
	}
	
	private boolean validateQuantity(int quantity) {
        return (quantity >= 1 && quantity <= 50);
    }
	
	void inputFoodQuantity(Scanner scanner){
        do{
            System.out.print("Input your food quantity or serving size [1 - 50] >> ");
            foodQuantity = scanner.nextInt();scanner.nextLine();
        }
        while (!validateQuantity(foodQuantity));
    }
	
	private boolean validateCalories(int calories) {
        return (calories >= 0 && calories <= 1500);
    }
	
	void inputFoodCalories(Scanner scanner){
        do{
            System.out.print("Input your food calories (per serving) [0 - 1500] >> ");
            foodCalories = scanner.nextInt();scanner.nextLine();
        }
        while (!validateCalories(foodCalories));
    }
	
	abstract double WeightEffect();
	abstract double HealthEffect();
}
