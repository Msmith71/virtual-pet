import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPet belly = new VirtualPet();
		VirtualPet water = new VirtualPet();
		VirtualPet mood = new VirtualPet();
		VirtualPet hygiene = new VirtualPet();
		
		belly.hunger = 100.00;
		water.thirst = 100.00;
		mood.happiness = 100.00;
		hygiene.cleanliness = 100.00;
		

				


		
		//pet name
		System.out.println("Please choose a name for your pet.");
		
		String petName = input.nextLine();
		
		boolean alive = true;
		
		
		while (alive) {
			System.out.println("========================");
			System.out.println("What would you like to do with " + petName);
			System.out.println("1. Feed");
			System.out.println("2. Give water");
			System.out.println("3. Play"); 
			System.out.println("4. Bathe"); 
			System.out.println("5. Nothing"); 
			System.out.println("========================");

			int choice = input.nextInt(); 


			switch (choice) {

	
				//feed
				case 1:
					if (choice == 1) {
						belly.hungerEat();
						
						System.out.println("You give " + petName + " a tastey treat!");
						System.out.println(petName + "'s current hunger is now " + belly.hunger);
					}
					break;
					
				//drink
				case 2:
					if (choice == 2) {
						water.thirstDrink();
						
						System.out.println("You give " + petName + " a bowl of water!");
						System.out.println(petName + "'s current thirst is now " + water.thirst);
					}
					break;
					
				//play
				case 3:
					if (choice == 3) {
						mood.happyPlay();
						
						System.out.println("You play with " + petName + "!");
						System.out.println(petName + "'s current happiness is now " + mood.happiness);
					}
					break;

				case 4:
					if (choice == 4) {
						hygiene.cleanlinessClean();
						
						System.out.println("You give " + petName + " a hot bathe!");
						System.out.println(petName + "'s cleanliness is " + hygiene.cleanliness);
					}
					break;

				

				

			}				 	
			

		}
	}

}
