import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Dog extends PetType{
	public Dog() {
		super();
		initFurLength();
		this.petType = "Dog";
	}
	
	String DogSize;
	String DogFurLength;
	
	public String getDogSize() {
		return DogSize;
	}

	public void setDogSize(String dogSize) {
		DogSize = dogSize;
	}

	public String getDogFurLength() {
		return DogFurLength;
	}

	public void setDogFurLength(String dogFurLength) {
		DogFurLength = dogFurLength;
	}

	String[] dogSizes = {"Small", "Medium", "Big"};
	String[] dogFurLengths = {"Short", "Medium", "Long"};
	HashMap<String,Integer> furLengths = new HashMap<String, Integer>();
	
	private void initFurLength() {
		furLengths.put("Short", 0);
		furLengths.put("Medium", 20000);
		furLengths.put("Long", 50000);
	}
	
	private boolean validateSize(String size){
        if (size.equals("SMALL") || size.equals("MEDIUM") || size.equals("BIG")){
            return true;
        }
        return false;
    } 
	
	void inputPetSize(Scanner scanner){
        do{
            System.out.print("Input Dog's Fur Size [");
            for (int i = 0; i < dogSizes.length; i++) {
                System.out.print(dogSizes[i]);
                if(i == dogSizes.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print("(case insensitive): ");
            DogSize = scanner.nextLine();
            DogSize =  DogSize.toUpperCase();
        }while (!validateSize(DogSize));
        DogSize = DogSize.toLowerCase();
        String firstLetter = DogSize.substring(0, 1);
        String remainingLetters = DogSize.substring(1, DogSize.length());
        firstLetter = firstLetter.toUpperCase();
        DogSize = firstLetter.concat(remainingLetters);
    }
	
	private boolean validateFurLength(String furLength){
        if (furLengths.containsKey(furLength)){
            return true;
        }
        return false;
    }
	
	void inputPetFurLength(Scanner scanner){
        do{
            System.out.print("Input Dog's Fur Length [");
            for (int i = 0; i < dogFurLengths.length; i++) {
                System.out.print(dogFurLengths[i]);
                if(i == dogFurLengths.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print("(case sensitive) : ");
            DogFurLength = scanner.nextLine();
        }
        while (!validateFurLength(DogFurLength));
    }
	
	@Override
	String getPetID() {
		String dogID;
		Random rand = new Random();
		int number1 = rand.nextInt(10);
		int number2 = rand.nextInt(10);
		int number3 = rand.nextInt(10);
		dogID = "D" + getDogSize().charAt(0) + number1 + number2 + number3;
		return dogID;
	}

	@Override
	int getPetFinalPrice() {
		return getPetBasePrice() + furLengths.get(DogFurLength);
	}
	
}
