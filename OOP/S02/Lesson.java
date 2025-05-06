public class Lesson {

    public static void main(String[] args) {
        aircraft cessna172 = new aircraft(); // creates object of class aircraft
        aircraft piperSaratoga = new aircraft();
		
		double aircraftEndurance;
		
		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 141;
		cessna172.fuelBurnRate = 9.5;
		cessna172.fuelCapacity = 56.4; 
		
		piperSaratoga.passengers = 5;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		aircraftEndurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
		
		System.out.println("Maximum Time that the cessna172 can stay in air is: " + aircraftEndurance + " hrs");
    }
}

class aircraft {
    int passengers;     // number of people
    int cruiseSpeed;    // miles per hour
    double fuelCapacity; // gallons
    double fuelBurnRate; // gallons per hour
}