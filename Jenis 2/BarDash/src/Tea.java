import java.util.Scanner;

public class Tea extends DrinkType{
	public Tea() {
		super();
		this.drinkType= "Tea";
	}
	
	int drinkLeavesWeight;
	
	public int getDrinkLeavesWeight() {
		return drinkLeavesWeight;
	}

	public void setDrinkLeavesWeight(int drinkLeaveWeight) {
		this.drinkLeavesWeight = drinkLeaveWeight;
	}
	
	private boolean validateLeavesWeight(int leavesWeight) {
        return (leavesWeight > 1 && leavesWeight < 5);
    }
	
	void inputDrinkLeavesWeight(Scanner scanner){
        do{
            System.out.print("Input leaves weight [1 - 5]: ");
            drinkLeavesWeight = scanner.nextInt();scanner.nextLine();
        }
        while (!validateLeavesWeight(drinkLeavesWeight));
    }
	
	@Override
	int getFinalPrice() {
		return getDrinkBasePrice() + (getDrinkLeavesWeight() * 2000);
	}
}
