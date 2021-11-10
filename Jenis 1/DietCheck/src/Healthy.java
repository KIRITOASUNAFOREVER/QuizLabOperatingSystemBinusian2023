import java.util.Scanner;

public class Healthy extends FoodType{
	public Healthy() {
		super();
		this.foodType = "Healthy";
	}
	
	String foodNutrient;
	
	
	public String getFoodNutrient() {
		return foodNutrient;
	}

	public void setFoodNutrient(String foodNutrient) {
		this.foodNutrient = foodNutrient;
	}

	private boolean validateNutrient(String nutrient){
        if (nutrient.endsWith("nutrient")){
            return true;
        }
        return false;
    }
	
	void inputFoodNutrient(Scanner scanner){
		do{
			System.out.print("Input your food main nutrition [ends with 'nutrient'] >> ");
			foodNutrient = scanner.nextLine();
		}while(!validateNutrient(foodNutrient));
	}

	@Override
	double WeightEffect() {
		return ((getFoodCalories() * getFoodQuantity() * 0.1)/100) + 1;
	}

	@Override
	double HealthEffect() {
		return ((getFoodCalories() * getFoodQuantity() * 0.6)/100) + 2;
	}
}
