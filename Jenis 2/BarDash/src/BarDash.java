import java.util.Scanner;
import java.util.Vector;

public class BarDash {
	Scanner scan = new Scanner(System.in);
	Vector<DrinkList> drinkList = new Vector<>();
	
	void teaInput() {
		Tea tea = new Tea();
		tea.inputDrinkName(scan);
		tea.inputDrinkTemperature(scan);
		tea.inputDrinkSugar(scan);
		tea.inputDrinkBasePrice(scan);
		tea.inputDrinkLeavesWeight(scan);
		drinkList.add(new DrinkList("Tea", tea.getDrinkName(), tea.getDrinkTemperature(), tea.getDrinkSugarAmount(), tea.getDrinkBasePrice(), tea.getDrinkLeavesWeight(), "",tea.getFinalPrice()));
	}
	
	void bobaInput() {
		Boba boba = new Boba();
		boba.inputDrinkName(scan);
		boba.inputDrinkTemperature(scan);
		boba.inputDrinkSugar(scan);
		boba.inputDrinkBasePrice(scan);
		boba.inputDrinkTopping(scan);
		drinkList.add(new DrinkList("Boba", boba.getDrinkName(), boba.getDrinkTemperature(), boba.getDrinkSugarAmount(), boba.getDrinkBasePrice(), 0, boba.getDrinkBobaTopping(),boba.getFinalPrice()));
	}
	
	private boolean validateType(String type){
        if (type.equals("Tea") || type.equals("Boba")){
            return true;
        }
        return false;
    }
	
	void AddDrink() {
		String drinkType;
		String[] drinkTypes = {"Tea", "Boba"};
		do{
            System.out.print("Choose drink's type [");
            for (int i = 0; i < drinkTypes.length; i++) {
                System.out.print(drinkTypes[i]);
                if(i == drinkTypes.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print("(case sensitive): ");
            drinkType = scan.nextLine();
        }while (!validateType(drinkType));
		if(drinkType.equals("Tea")) {
			teaInput();
		}else if(drinkType.equals("Boba")) {
			bobaInput();
		}
	}
	
	void ViewDrink() {
		int jumlah = drinkList.size();
		if(jumlah==0) {
			System.out.println("There are no drinks available yet");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}else {
			for (int i = 0; i < jumlah; i++) {
				if(drinkList.get(i).getDrinkType().equals("Tea")) {
					System.out.println("=====================");
					System.out.println("Type: "+drinkList.get(i).getDrinkType());
					System.out.println("Name: "+drinkList.get(i).getDrinkName());
					System.out.println("Sugar: "+drinkList.get(i).getDrinkSugarAmount());
					System.out.println("Price: "+drinkList.get(i).getFinalPrice());
					System.out.println("Temperature: "+drinkList.get(i).getDrinkTemperature());
					System.out.println("Tea Leaves Weight: "+drinkList.get(i).getDrinkLeavesWeight());
					System.out.println("=====================");
				}else if(drinkList.get(i).getDrinkType().equals("Boba")) {
					System.out.println("=====================");
					System.out.println("Type: "+drinkList.get(i).getDrinkType());
					System.out.println("Name: "+drinkList.get(i).getDrinkName());
					System.out.println("Sugar: "+drinkList.get(i).getDrinkSugarAmount());
					System.out.println("Price: "+drinkList.get(i).getFinalPrice());
					System.out.println("Temperature: "+drinkList.get(i).getDrinkTemperature());
					System.out.println("Topping: "+drinkList.get(i).getDrinkBobaTopping());
					System.out.println("=====================");
				}
				System.out.println(); System.out.println();
			}
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}
	}
	
	public BarDash() {
		int pilihan;
		System.out.println("Welcome to Bar Dash!");
		System.out.println("=====================");
		do {
			System.out.println("1. Add Drink");
			System.out.println("2. View Drink");
			System.out.println("3. Exit");
			System.out.print(">> ");
			pilihan = scan.nextInt(); scan.nextLine();
			if(pilihan==1) {
				AddDrink();
			}else if(pilihan==2) {
				ViewDrink();
			}
		} while (pilihan != 3);
	}
	
	public static void main(String[] args) {
		new BarDash();
	}
}
