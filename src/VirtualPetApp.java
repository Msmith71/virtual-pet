import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPet belly = new VirtualPet();
		VirtualPet water = new VirtualPet();
		VirtualPet mood = new VirtualPet();
		VirtualPet hygiene = new VirtualPet();
		VirtualPet status = new VirtualPet();
		
		belly.hunger = 50.00;
		water.thirst = 50.00;
		mood.happiness = 80.00;
		hygiene.cleanliness = 90.00;
		status.alive = true;
		
		//pet name
		System.out.println("Please choose a name for your pet.");
		
		String petName = input.nextLine();
		
		
		
		
		while (status.alive) {
			System.out.println("====================================================");
			System.out.println("What would you like to do with " + petName);
			System.out.println("1. [Feed]" + " Current hunger: " + belly.hunger);
			System.out.println("2. [Give water]" + " Current thirst: " + water.thirst);
			System.out.println("3. [Play]" + " Current happiness: " + mood.happiness); 
			System.out.println("4. [Bathe]" + " Current cleanliness: " + hygiene.cleanliness); 
			System.out.println("5. [Nothing]"); 
			System.out.println("====================================================");
			
			
			int deathStrike = 0;

			
			if (belly.hunger <= 0) {
				deathStrike += 1;
			}
			if (water.thirst <= 0) {
				deathStrike += 1;
			}
			if (mood.happiness <= 0) {
				deathStrike += 1;
			}
			if (hygiene.cleanliness <= 0) {
				deathStrike += 1;
			}
			if (deathStrike == 3) {
				System.out.println("Due to neglect and  miscare " + petName + " has starved to death.");
				
				System.out.println("GAME OVER");

				
			}
			
			int choice = input.nextInt(); 


			switch (choice) {

	
				//feed
				case 1:
					if (choice == 1 && belly.hunger >= 100 ) {
						System.out.println(petName + " is full, and doesn't want to eat.");
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
					} else if (choice == 1) {
						belly.hungerEat();
						hygiene.cleanliness -= 5;
						System.out.println("You give " + petName + " a tastey treat!");
						System.out.println(petName + "'s current hunger is now " + belly.hunger);
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
					if (belly.hunger < 30) {
							System.out.println(petName + " is hungry and needs to eat soon!");
						}
						if (water.thirst < 30) {
							System.out.println(petName + " is thirsty and needs to drink soon!");
						}
						if (mood.happiness <= 20) {
							System.out.println(petName + " looks sad, maybe you should cheer them up!?");
						}
						if (hygiene.cleanliness <= 25) {
							System.out.println(petName + " smells really bad, you should probably give them a bath.");
						}
					}
					break;
					
				//drink
				case 2:
					if (choice == 2 && water.thirst >= 100) {
						System.out.println(petName + " is hydrated, and doesn't want to drink.");
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
					} else if (choice == 2) {
						water.thirstDrink();
						hygiene.cleanliness -= 3;
						System.out.println("You give " + petName + " a bowl of water!");
						System.out.println(petName + "'s current thirst is now " + water.thirst);
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
						if (belly.hunger < 30) {
							System.out.println(petName + " is hungry and needs to eat soon!");
						}
						if (water.thirst < 30) {
							System.out.println(petName + " is thirsty and needs to drink soon!");
						}
						if (mood.happiness <= 20) {
							System.out.println(petName + " looks sad, maybe you should cheer them up!?");
						}
						if (hygiene.cleanliness <= 25) {
							System.out.println(petName + " smells really bad, you should probably give them a bath.");
						}
					}
					break;
					
				//play
				case 3:
					if (choice == 3 && mood.happiness >= 100) {
						System.out.println(petName + " does'nt feel like playing right now.");
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
					} else if (choice == 3) {
						mood.happyPlay();
						belly.hunger -= 5;
						water.thirst -= 8;
						hygiene.cleanliness -= 2;
						System.out.println("You play with " + petName + "!");
						System.out.println(petName + "'s current happiness is now " + mood.happiness);
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
						if (belly.hunger < 30) {
							System.out.println(petName + " is hungry and needs to eat soon!");
						}
						if (water.thirst < 30) {
							System.out.println(petName + " is thirsty and needs to drink soon!");
						}
						if (mood.happiness <= 20) {
							System.out.println(petName + " looks sad, maybe you should cheer them up!?");
						}
						if (hygiene.cleanliness <= 25) {
							System.out.println(petName + " smells really bad, you should probably give them a bath.");
						}
						
					}
					break;
					
				//clean
				case 4:
					if (choice == 4 && hygiene.cleanliness >= 100) {
						System.out.println(petName + " is already as clean as possible. Any more and they might lose some fur.");
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
					}
				else if (choice == 4) {
						hygiene.cleanlinessClean();
						mood.happiness -= 3;
						System.out.println("You give " + petName + " a hot bathe!");
						System.out.println(petName + "'s cleanliness is " + hygiene.cleanliness);
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
						if (belly.hunger < 30) {
							System.out.println(petName + " is hungry and needs to eat soon!");
						}
						if (water.thirst < 30) {
							System.out.println(petName + " is thirsty and needs to drink soon!");
						}
						if (mood.happiness <= 20) {
							System.out.println(petName + " looks sad, maybe you should cheer them up!?");
						}
						if (hygiene.cleanliness <= 25) {
							System.out.println(petName + " smells really bad, you should probably give them a bath.");
						}
					}
				case 5:
					if (choice == 5) {
						System.out.println("You do nothing.");
						belly.updateHunger();
						water.updateThirst();
						mood.updateHappiness();
						hygiene.updateCleanliness();
						if (belly.hunger < 30) {
							System.out.println(petName + " is hungry and needs to eat soon!");
						}
						if (water.thirst < 30) {
							System.out.println(petName + " is thirsty and needs to drink soon!");
						}
						if (mood.happiness <= 20) {
							System.out.println(petName + " looks sad, maybe you should cheer them up!?");
						}
						if (hygiene.cleanliness <= 25) {
							System.out.println(petName + " smells really bad, you should probably give them a bath.");
						}
					}
					break;
	
					
						
					}
			}				 				
		}
}