import java.util.Scanner;
import java.util.Vector;

public class DietCheck {
	Scanner scan  = new Scanner(System.in);
	Vector<FoodList> foodList = new Vector<>();
	
	void JunkInput(double weight, double health, double minimumWeight, double maximumWeight) {
		Junk junk = new Junk();
		junk.inputFoodName(scan);
		junk.inputFoodQuantity(scan);
		junk.inputFoodCalories(scan);
		junk.inputFoodSugar(scan);
		double tempWeight = weight, temphealth = health;
		if(weight + junk.WeightEffect() > 100) {
			weight = 100;
		}else {
			weight = weight + junk.WeightEffect();
		}
		if( health - junk.HealthEffect()< 0) {
			health = 0;
		}else {
			health = health - junk.WeightEffect();
		}
		
		double diff = weight - tempWeight;
		int newCalo, newSugar;
		if(health > 85 && diff> 4) {
			System.out.println("You maintain your health & weight well. You deserve a cheat day.");
			String cheatCek;
			do {
				System.out.println("Do you need a cheat day? [y | n] [case sensitive] >> ");
				cheatCek = scan.nextLine();
			}while(!cheatCek.equals("y") && !cheatCek.equals("n"));
			if(cheatCek.equals("y")) {	
				newCalo = (junk.getFoodCalories()*80/100);
				newSugar = junk.getFoodSugar()*50/100;
				junk.setFoodCalories(newCalo);
				junk.setFoodSugar(newSugar);
				if(weight + junk.WeightEffect() > 100) {
					weight = 100;
				}else {
					weight = weight + junk.WeightEffect();
				}
				if( health - junk.HealthEffect()< 0) {
					health = 0;
				}else {
					health = health - junk.HealthEffect();
				}
				System.out.println("Processing cheat day. Calories reduced to "+newCalo +", sugar level to " +newSugar);
			}
		}
		double diffWeight = tempWeight - weight;
		double diffHealth = temphealth - health;
		if(diffHealth==0) {
			diffHealth = 0;
		}else {
			diffHealth = (health/diffHealth)*100;
		}
		System.out.println("Successfully insert food...");
		System.out.println("Current weight         : "+weight +"(Weight effect "+diffWeight +" kg)");
		System.out.println("Current health         : "+health +"% "+"(Health effect "+"-" +diffHealth +"%)");
		System.out.println("========================");
		System.out.println("Press [Enter] to proceed...");
		scan.nextLine();
		foodList.add(new FoodList("Junk", junk.getFoodName(), junk.getFoodQuantity(), junk.getFoodCalories(), "",junk.getFoodSugar(),tempWeight,temphealth,weight,health,diffWeight,diffHealth));
		int jumlah  = foodList.size();
		if(((foodList.get(foodList.size()-1).getFinalHealth() < 40) || foodList.get(foodList.size()-1).getFinalWeight() < minimumWeight || foodList.get(foodList.size()-1).getFinalWeight() > maximumWeight) ){
			System.out.println("Oops! Your diet fails ):");
			if(jumlah==1) {
				double finalBedaWeight;
				double finalBedaHealth;
				finalBedaWeight = foodList.get(jumlah-1).getFinalWeight() - weight;
				finalBedaHealth = foodList.get(jumlah-1).getFinalHealth() - health;
				System.out.println("Thank you for using Diet CHeck.");
				System.out.println("===============================");
				System.out.println("Your final weight          : "+foodList.get(0).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
				System.out.println("Your final health          : "+foodList.get(0).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
				System.exit(0);
			}else {
				double finalBedaWeight;
				double finalBedaHealth;
				finalBedaWeight = foodList.get(jumlah-1).getFinalWeight() - foodList.get(0).getFinalWeight();
				finalBedaHealth = foodList.get(jumlah-1).getFinalHealth() - foodList.get(0).getFinalHealth();
				System.out.println("Thank you for using Diet CHeck.");
				System.out.println("===============================");
				System.out.println("Your final weight          : "+foodList.get(jumlah-1).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
				System.out.println("Your final health          : "+foodList.get(jumlah-1).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
				System.exit(0);
			}
		}
	}
	
	void HealthyInput(double weight, double health, double minimumWeight, double maximumWeight) {
		Healthy healthy = new Healthy();
		healthy.inputFoodName(scan);
		healthy.inputFoodQuantity(scan);
		healthy.inputFoodCalories(scan);
		healthy.inputFoodNutrient(scan);
		double tempWeight = weight, temphealth = health;
		if(healthy.getFoodNutrient().contains("fiber")) {
			if( weight - healthy.WeightEffect() < 0) {
				weight = 0;
				health = health;
			}else {
				weight = weight - healthy.WeightEffect();
				health = health;
			}
		}else {
			if(weight + healthy.WeightEffect() > 100) {
				weight = 100;
			}else {
				weight = weight + healthy.WeightEffect();
			}
			if(health + healthy.HealthEffect() > 100) {
				health = 100;
			}else {
				health = health + healthy.HealthEffect();
			}		
		}
		double diffWeight = tempWeight - weight;
		double diffHealth = temphealth - health;
		if(diffHealth==0) {
			diffHealth = 0;
		}else {
			diffHealth = (health/diffHealth)*100;
		}
		System.out.println("Successfully insert food...");
		System.out.println("Current weight         : "+weight +"(Weight effect "+diffWeight +" kg)");
		System.out.println("Current health         : "+health +"% "+"(Health effect "+"-" +diffHealth +"%)");
		System.out.println("========================");
		System.out.println("Press [Enter] to proceed...");
		scan.nextLine();
		foodList.add(new FoodList("Healthy", healthy.getFoodName(), healthy.getFoodQuantity(), healthy.getFoodCalories(), healthy.getFoodNutrient(), 0,tempWeight,temphealth,weight,health,diffWeight,diffHealth));
		int jumlah  = foodList.size();
		if(((foodList.get(foodList.size()-1).getFinalHealth() < 40) || foodList.get(foodList.size()-1).getFinalWeight() < minimumWeight || foodList.get(foodList.size()-1).getFinalWeight() > maximumWeight) ){
			System.out.println("Oops! Your diet fails ):");
			if(jumlah==1) {
				double finalBedaWeight;
				double finalBedaHealth;
				finalBedaWeight = foodList.get(jumlah-1).getFinalWeight() - weight;
				finalBedaHealth = foodList.get(jumlah-1).getFinalHealth() - health;
				System.out.println("Thank you for using Diet CHeck.");
				System.out.println("===============================");
				System.out.println("Your final weight          : "+foodList.get(0).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
				System.out.println("Your final health          : "+foodList.get(0).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
				System.exit(0);
			}else {
				double finalBedaWeight;
				double finalBedaHealth;
				finalBedaWeight = foodList.get(jumlah-1).getFinalWeight() - foodList.get(0).getFinalWeight();
				finalBedaHealth = foodList.get(jumlah-1).getFinalHealth() - foodList.get(0).getFinalHealth();
				System.out.println("Thank you for using Diet CHeck.");
				System.out.println("===============================");
				System.out.println("Your final weight          : "+foodList.get(jumlah-1).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
				System.out.println("Your final health          : "+foodList.get(jumlah-1).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
				System.exit(0);
			}
		}	 
	}
	
	private boolean validateFoodType(String foodType){
        if (foodType.equals("Junk") || foodType.equals("Healthy")){
            return true;
        }
        return false;
    }
	
	void AddFood(double weight, double health, double minimumWeight, double maximumWeight) {
		System.out.println("DietCHeck! - Insert Menu");
		System.out.println("========================");
		String foodType;
		String[] foodTypes = {"Junk", "Healthy"};
		do{
            System.out.print("Choose your food type [");
            for (int i = 0; i < foodTypes.length; i++) {
                System.out.print(foodTypes[i]);
                if(i == foodTypes.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print("[Case Sensitive] >> ");
            foodType = scan.nextLine();
        }while (!validateFoodType(foodType));
		if(foodType.equals("Junk")) {
			JunkInput(weight, health, minimumWeight, maximumWeight);
		}else if(foodType.equals("Healthy")) {
			HealthyInput(weight, health, minimumWeight, maximumWeight);
		}
	}
	
	void viewFood() {
		int jumlah = foodList.size();
		int jumlahHealth = 0;
		int jumlahJunk = 0;
		int indeksHealth = 1;
		int indeksJunk = 1;
		if(jumlah > 0) {
			for (int i = 0; i < jumlah; i++) {
				if(foodList.get(i).getFoodType().equals("Healthy")) {
					jumlahHealth++;
				}else if(foodList.get(i).getFoodType().equals("Junk")) {
					jumlahJunk++;
				}
			}
		}
		System.out.println("DietCHeck! - Healthy Food History");
		System.out.println("=================================");
		if(jumlahHealth==0) {
			System.out.println("0. Empty");
		}else {
			for (int i = 0; i < jumlah; i++) {
				if(foodList.get(i).getFoodType().equals("Healthy")) {
					System.out.println((indeksHealth++)+"." +foodList.get(i).getFoodName() +" | " +foodList.get(i).getDiffWeight() +" kg  weight effect");
				}
			}
		}
		System.out.println("DietCHeck! - Junk Food History");
		System.out.println("=================================");
		if(jumlahJunk==0) {
			System.out.println("0. Empty");
		}else {
			for (int i = 0; i < jumlah; i++) {
				if(foodList.get(i).getFoodType().equals("Junk")) {
					System.out.println((indeksJunk++)+"." +foodList.get(i).getFoodName() +" | " +foodList.get(i).getDiffWeight() +" kg  weight effect");
				}
			}
		}
	}
	
	void dietCheckMenu(double weight, double health, double minimumWeight, double maximumWeight){
		int pilihan = 0;
		do {
				System.out.println("DietCHeck!");
				System.out.println("==========");
				System.out.println("1. Insert Food Intake");
				System.out.println("2. View Intake History");
				System.out.println("3. Exit");
				System.out.print(">> ");
				pilihan = scan.nextInt(); scan.nextLine();
				if(pilihan==1) {
					AddFood(weight, health, minimumWeight, maximumWeight);
				}else if(pilihan==2) {
					viewFood();
				}else if(pilihan==3) {
					int jumlah = foodList.size();
					if(jumlah==0) {
						System.out.println("Thank you for using Diet CHeck.");
						System.out.println("===============================");
						System.out.println("Your final weight          : "+weight +" (" +"0.0 kg from your starting weight)");
						System.out.println("Your final health          : "+health +"%" +" (0% decreased)");
					}else if(jumlah==1) {
						double finalBedaWeight;
						double finalBedaHealth;
						finalBedaWeight = foodList.get(0).getFinalWeight() - weight;
						finalBedaHealth = foodList.get(0).getFinalHealth() - health;
						System.out.println("Thank you for using Diet CHeck.");
						System.out.println("===============================");
						System.out.println("Your final weight          : "+foodList.get(0).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
						System.out.println("Your final health          : "+foodList.get(0).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
					}else {
						double finalBedaWeight;
						double finalBedaHealth;
						finalBedaWeight = foodList.get(jumlah-1).getFinalWeight() - foodList.get(0).getFinalWeight();
						finalBedaHealth = foodList.get(jumlah-1).getFinalHealth() - foodList.get(0).getFinalHealth();
						System.out.println("Thank you for using Diet CHeck.");
						System.out.println("===============================");
						System.out.println("Your final weight          : "+foodList.get(jumlah-1).getFinalWeight() +" (" +finalBedaWeight +" kg from your starting weight)");
						System.out.println("Your final health          : "+foodList.get(jumlah-1).getFinalHealth() +"%" +" (" +finalBedaHealth +"% decreased)");
					}
				}
		} while (pilihan != 3);
	}
	
	public DietCheck() {
		double weight;
		System.out.println("DietCHeck!");
		System.out.println("==========");
		do {
			System.out.print("Input your weight in kg [38 - 50] >> ");
			weight = scan.nextDouble(); scan.nextLine();
		} while (weight < 38 || weight > 50);
		
		double health = 100.0;
		double minimumWeight = (80*weight)/100;
		double maximumWeight =  (120*weight)/100;
		System.out.println("Current Data");
		System.out.println("============");
		System.out.println("Weight              : "+weight +" kg");
		System.out.println("Health              : "+health +"%");
		System.out.println("Be Careful with your weight.");
		System.out.println("Mininum weight "+minimumWeight +" kg, " + "maximum weight "+maximumWeight +" kg.");
		System.out.println("Press [Enter] to proceed...");
		scan.nextLine();
		dietCheckMenu(weight,health,minimumWeight,maximumWeight);
	}
	
	public static void main(String[] args) {
		new DietCheck();
	}
}
