import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int userInput = input.nextInt();
		switch (userInput) {
		
		case 1:
			System.out.println("Check Status");
		case 2:
			System.out.println("Feed");
		case 3:
			System.out.println("Drink");
		case 4:
			System.out.println("Clean");
		case 5:
			System.out.println("Play with");
		}
		
	}

}
