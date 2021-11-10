
public class PetList {
	String petID;
	String petType;
	String petBreed;
	int petAge;
	int petBasePrice;
	String petGender;
	String DogSize;
	String DogFurLength;
	double SnakeLength;
	int finalPetPrice;
	public PetList(String petID, String petType, String petBreed, int petAge, int petBasePrice, String petGender,
			String dogSize, String dogFurLength, double snakeLength, int finalPetPrice) {
		super();
		this.petID = petID;
		this.petType = petType;
		this.petBreed = petBreed;
		this.petAge = petAge;
		this.petBasePrice = petBasePrice;
		this.petGender = petGender;
		DogSize = dogSize;
		DogFurLength = dogFurLength;
		SnakeLength = snakeLength;
		this.finalPetPrice = finalPetPrice;
	}
	public String getPetID() {
		return petID;
	}
	public void setPetID(String petID) {
		this.petID = petID;
	}
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
	public double getSnakeLength() {
		return SnakeLength;
	}
	public void setSnakeLength(double snakeLength) {
		SnakeLength = snakeLength;
	}
	public int getFinalPetPrice() {
		return finalPetPrice;
	}
	public void setFinalPetPrice(int finalPetPrice) {
		this.finalPetPrice = finalPetPrice;
	}
}
