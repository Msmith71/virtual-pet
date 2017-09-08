
public class VirtualPet {
	String petName;
	double hunger;
	double thirst;
	double happiness;
	double cleanliness;
	
	double eat = 20.0;
	double drink = 20.0;
	double play = 30.0;
	double clean = 50.0;
	
	boolean alive = true;
	
	//hunger decreases by 5
	void updatetHunger() {
		hunger -= 5;
	}
	//thirst decreases by 6.5
	void updateThirst() {
		thirst -= 6.5;
	}
	
	//Happiness decreases by 6
	void updatetHappiness() {
		happiness -= 6;
	}
	
	//Cleanliness decreases by 20
	void updateCleanliness() {
		cleanliness -= 20;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////

	
	//pet eats
	void hungerEat() {
		hunger += eat;
	}
	//pet drinks
	void thirstDrink() {
		thirst += drink;
	}
	
	//pet plays
	void happyPlay() {
		happiness += play;
	}
	
	//pet is cleaned
	void cleanlinessClean() {
		cleanliness += clean;
	}
	

	
	
}
