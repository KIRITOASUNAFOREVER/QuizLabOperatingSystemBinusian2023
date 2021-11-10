import java.util.Scanner;

public class Junk extends FoodType{
	public Junk() {
		super();
		this.foodType = "Junk";
	}
	
	int foodSugar;
	
	public int getFoodSugar() {
		return foodSugar;
	}

	public void setFoodSugar(int foodSugar) {
		this.foodSugar = foodSugar;
	}

	private boolean validateSugar(int sugar) {
        return (sugar >= 0 && sugar <= 5);
    }
	
	void inputFoodSugar(Scanner scanner){
        do{
            System.out.print("Input your food sugar [0 - 5] >> ");
            foodSugar = scanner.nextInt();scanner.nextLine();
        }
        while (!validateSugar(foodSugar));
    }
	
	@Override
	double WeightEffect() {
		return ((getFoodCalories() * (getFoodSugar()+1) * getFoodQuantity() * 0.2)/100);
	}

	@Override
	double HealthEffect() {
		return ((getFoodCalories() * (getFoodSugar()+1) * getFoodQuantity() * 0.5)/100);
	}

	
}
