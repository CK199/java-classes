
public class Player {
	
	String name;
	String league;
	String gender;
	int age;
	int pace;
	int strength;
	int workRate;
	int energy;
	
	public Player(String humanName, String humanLeague, String humanGender, int humanAge, int humanPace, int humanStrength, int humanWorkRate, int humanEnergy) {
		name = humanName;
		league = humanLeague;
		gender = humanGender;
		age = humanAge;
		pace = humanPace;
		strength = humanStrength;
		workRate = humanWorkRate;
		energy = humanEnergy;
	}
	
	public static void main(String[] args) {
		Player ronaldo = new Player("Ronaldo","Premier League", "male", 35, 65, 85, 90, 45);
		System.out.println(ronaldo.gender);
	}

}