import java.util.HashMap;
import java.util.Scanner;

public class Boba extends DrinkType{
	public Boba() {
		super();
		initBobaTopping();
		this.drinkType= "Boba";
	}
	
	String drinkBobaTopping;
	
	public String getDrinkBobaTopping() {
		return drinkBobaTopping;
	}

	public void setDrinkBobaTopping(String drinkBobaTopping) {
		this.drinkBobaTopping = drinkBobaTopping;
	}
	
	String[] bobaTopping = {"Pearl", "Grass Jelly", "Coffee Jelly"};
	HashMap<String,Integer> bobaToppings = new HashMap<String, Integer>();
	
	private void initBobaTopping() {
		bobaToppings.put("Pearl", 3000);
		bobaToppings.put("Grass Jelly", 4000);
		bobaToppings.put("Coffee Jelly", 5000);
	}
	
	private boolean validateTopping(String topping){
        if (bobaToppings.containsKey(topping)){
            return true;
        }
        return false;
    }
	
	void inputDrinkTopping(Scanner scanner){
		do{
			System.out.print("Weapon Type [");
            for (int i = 0; i < bobaTopping.length; i++) {
                System.out.print(bobaTopping[i]);
                if(i == bobaTopping.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.println("(case sensitive): ");
			drinkBobaTopping = scanner.nextLine();
		}while(!validateTopping(drinkBobaTopping));
	}

	@Override
	int getFinalPrice() {
		return getDrinkBasePrice() + bobaToppings.get(drinkBobaTopping);
	}

}
