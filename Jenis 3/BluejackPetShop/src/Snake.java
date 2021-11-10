import java.util.Random;
import java.util.Scanner;

public class Snake extends PetType{
	public Snake() {
		super();
		this.petType = "Snake";
	}
	
	double SnakeLength;
	
	public double getSnakeLength() {
		return SnakeLength;
	}

	public void setSnakeLength(double snakeLength) {
		SnakeLength = snakeLength;
	}
	
	private boolean validateSnakeLength(double snakeLength) {
        return (snakeLength > 0.1 && snakeLength < 10);
    }
	
	void inputPetLength(Scanner scanner){
        do{
            System.out.print("Input Snake's length [0.1 - 10]: ");
            SnakeLength = scanner.nextDouble();scanner.nextLine();
        }while (!validateSnakeLength(SnakeLength));
    }

	@Override
	String getPetID() {
		String snakeID;
		Random rand = new Random();
		int number1 = rand.nextInt(10);
		int number2 = rand.nextInt(10);
		int number3 = rand.nextInt(10);
		int number4 = rand.nextInt(10);
		snakeID = "S" + number1 + number2 + number3 + number4;
		return snakeID;
	}

	@Override
	int getPetFinalPrice() {
		int roundDown = (int) SnakeLength;
		return getPetBasePrice() + (roundDown*10000);
	}
	
}
