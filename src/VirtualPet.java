
public class VirtualPet {
	String petName;
	double hunger;
	double thirst;
	double happiness;
	double cleanliness;
	
	double eat = 30.0;
	double drink = 30.0;
	double play = 40.0;
	double clean = 50.0;
	
	double hungerDecay = 5;
	boolean alive = true;
	
	//hunger decreases by 5
	void updateHunger() {
		hunger -= hungerDecay;
	}
	//thirst decreases by 6.5
	void updateThirst() {
		thirst -= 6.5;
	}
	
	//Happiness decreases by 6
	void updateHappiness() {
		happiness -= 6;
	}
	
	//Cleanliness decreases by 20
	void updateCleanliness() {
		cleanliness -= 10;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////
	
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