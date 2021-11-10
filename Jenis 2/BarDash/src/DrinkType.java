import java.util.Scanner;

abstract class DrinkType {
	String drinkType;
	String drinkName;
	String drinkTemperature;
	int drinkSugarAmount;
	int drinkBasePrice;
	
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
	
	private boolean validateName(String name){
        if (name.length() > 5 && name.length() < 25){
            return true;
        }
        return false;
    }
	
	void inputDrinkName(Scanner scanner){
		do{
			System.out.print("Input name [5 - 25 characters]: ");
			drinkName = scanner.nextLine();
		}while(!validateName(drinkName));
	}
	
	private boolean validateTemperature(String temperature){
        if (temperature.equals("Hot") || temperature.equals("Cold")){
            return true;
        }
        return false;
    }
	
	void inputDrinkTemperature(Scanner scanner){
		do{
			System.out.print("Choose between Hot or Cold (case sensitive): ");
			drinkTemperature = scanner.nextLine();
		}while(!validateTemperature(drinkTemperature));
	}
	
	private boolean validateSugar(int sugar) {
        return (sugar > 1 && sugar < 5);
    }
	
	void inputDrinkSugar(Scanner scanner){
        do{
            System.out.print("Input sugar amount [1 - 5]: ");
            drinkSugarAmount = scanner.nextInt();scanner.nextLine();
        }
        while (!validateSugar(drinkSugarAmount));
    }
	
	private boolean validateBasePrice(int basePrice) {
        return (basePrice > 10000 && basePrice < 150000);
    }
	
	void inputDrinkBasePrice(Scanner scanner){
        do{
            System.out.print("Input price [10000 - 150000]: ");
            drinkBasePrice = scanner.nextInt();scanner.nextLine();
        }
        while (!validateBasePrice(drinkBasePrice));
    }
	
	abstract int getFinalPrice();
}
