import java.util.Scanner;
import java.util.Vector;

public class PetShop {
	Scanner scan = new Scanner(System.in);
	Vector<PetList> petList = new Vector<>();
	
	void dogInput() {
		Dog dog = new Dog();
		dog.inputPetBreed(scan);
		dog.inputPetAge(scan);
		dog.inputPetBasePrice(scan);
		dog.inputPetGender(scan);
		dog.inputPetSize(scan);
		dog.inputPetFurLength(scan);
		petList.add(new PetList(dog.getPetID(), "Dog", dog.getPetBreed(), dog.getPetAge(), dog.getPetBasePrice(), dog.getPetGender(), dog.getDogSize(), dog.getDogFurLength(), 0, dog.getPetFinalPrice()));
	}
	
	void snakeInput() {
		Snake snake = new Snake();
		snake.inputPetBreed(scan);
		snake.inputPetAge(scan);
		snake.inputPetBasePrice(scan);
		snake.inputPetGender(scan);
		snake.inputPetLength(scan);
		petList.add(new PetList(snake.getPetID(), "Snake", snake.getPetBreed(), snake.getPetAge(), snake.getPetBasePrice(), snake.getPetGender(), "", "", snake.getSnakeLength(), snake.getPetFinalPrice()));
	}
	
	void AddPet() {
		int tipePilihan;
		System.out.println("Select Category:");
        System.out.println("1. Dog");
        System.out.println("2. Snake");
		do{
            System.out.print("Choose> ");
            tipePilihan = scan.nextInt(); scan.nextLine();
        }while (tipePilihan!=1 && tipePilihan!=2);
		if(tipePilihan==1) {
			dogInput();
		}else if(tipePilihan==2) {
			snakeInput();
		}
	}
	
	boolean checkPetsAvailable(String id) {
		int panjang = petList.size();
		for (int i = 0; i < panjang; i++) {
			if(petList.get(i).getPetID().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	void viewPets() {
		int panjang = petList.size();
		if(panjang==0) {
			System.out.println("No Data!");
		}else {
			System.out.println("=============================================================================================");
			System.out.printf("| %-5s | %-27s |  %-5s |  %-15s | %-10s | %-10s |\n","ID", "Breed", "Age", "Price", "Gender", "Type");
			System.out.println("=============================================================================================");
			for(int i=0 ; i < panjang ;i++)
			{
				System.out.printf("| %-5s | %-27s |  %-5d |  %-15d | %-10s | %-10s |\n",petList.get(i).getPetID(), petList.get(i).getPetBreed(), petList.get(i).getPetAge(), petList.get(i).getFinalPetPrice(), petList.get(i).getPetGender(), petList.get(i).getPetType());
			}
			System.out.println("=============================================================================================");
			
			String inputID;
			do {
				System.out.print("Input ID to look at detail [0 to exit]: ");
				inputID = scan.nextLine();
				if(inputID.equals("0")) {
					return;
				}
			}while(!checkPetsAvailable(inputID));
			System.out.println(); System.out.println();
			int indeks = -1;
			if(checkPetsAvailable(inputID)) {
				for (int i = 0; i < panjang; i++) {
					if(petList.get(i).getPetID().equals(inputID)) {
						indeks = i;
						break;
					}
				}
				if(petList.get(indeks).getPetType().equals("Dog")) {
					System.out.println("Type       : "+petList.get(indeks).getPetType());
					System.out.println("Breed      ; "+petList.get(indeks).getPetBreed());
					System.out.println("Age        : "+petList.get(indeks).getPetAge());
					System.out.println("Price      : "+petList.get(indeks).getFinalPetPrice());
					System.out.println("Size       : "+petList.get(indeks).getDogSize());
					System.out.println("Fur Length : "+petList.get(indeks).getDogFurLength());
				}else if(petList.get(indeks).getPetType().equals("Snake")) {
					System.out.println("Type       : "+petList.get(indeks).getPetType());
					System.out.println("Breed      ; "+petList.get(indeks).getPetBreed());
					System.out.println("Age        : "+petList.get(indeks).getPetAge());
					System.out.println("Price      : "+petList.get(indeks).getFinalPetPrice());
					System.out.println("Length     : "+petList.get(indeks).getSnakeLength());
				}
			}
			scan.nextLine();
		}
	}
	
	public PetShop() {
		int pilihan;
		do {
			System.out.println("Bluejack Pet Shop");
			System.out.println("=================");
			System.out.println("1. Add New Pet");
			System.out.println("2. View All Pets");
			System.out.println("3. Exit");
			System.out.print("Choose> ");
			pilihan = scan.nextInt(); scan.nextLine();
			if(pilihan==1) {
				AddPet();
			}else if(pilihan==2) {
				viewPets();
			}
		} while (pilihan != 3);
		
	}
	
	public static void main(String[] args) {
		new PetShop();
	}
}
