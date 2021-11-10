import java.util.Scanner;

abstract class PetType {
	String petType;
	String petBreed;
	int petAge;
	int petBasePrice;
	String petGender;
	
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public int getPetBasePrice() {
		return petBasePrice;
	}
	public void setPetBasePrice(int petBasePrice) {
		this.petBasePrice = petBasePrice;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	
	private boolean validateBreed(String breed){
        if (breed.length() > 5 && breed.length() < 20){
            return true;
        }
        return false;
    }
	
	void inputPetBreed(Scanner scanner){
		do{
			System.out.print("Enter Pet's Breed [5 - 20 characters]: ");
			petBreed = scanner.nextLine();
		}while(!validateBreed(petBreed));
	}
	
	private boolean validateAge(int age) {
        return (age > 0);
    }
	
	void inputPetAge(Scanner scanner){
        do{
            System.out.print("Input Age [Must be more than 0]: ");
            petAge = scanner.nextInt();scanner.nextLine();
        }while (!validateAge(petAge));
    }
	
	private boolean validateBasePrice(int basePrice) {
        return (basePrice > 10000 && basePrice < 10000000);
    }
	
	void inputPetBasePrice(Scanner scanner){
        do{
            System.out.print("Input Base Price [10000 - 10000000]: ");
            petBasePrice = scanner.nextInt();scanner.nextLine();
        }
        while (!validateBasePrice(petBasePrice));
    }
	
	String[] genderOption = {"Female", "Male"};
	private boolean validateGender(String gender){
        if (gender.equals("Female") || gender.equals("Male")){
            return true;
        }
        return false;
    } 
	
	void inputPetGender(Scanner scanner){
        do{
            System.out.print("Input Gender [");
            for (int i = 0; i < genderOption.length; i++) {
                System.out.print(genderOption[i]);
                if(i == genderOption.length-1){
                    System.out.print("] ");
                }else{
                    System.out.print(" | ");
                }
            }
            System.out.print("(case sensitive): ");
            petGender = scanner.nextLine();
        }
        while (!validateGender(petGender));
    }
	
	abstract String getPetID();
	abstract int getPetFinalPrice();
}
