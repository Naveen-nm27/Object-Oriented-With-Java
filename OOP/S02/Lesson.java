public class Lesson {

    public static void main(String[] args) {
        aircraft cessna172 = new aircraft(4,141,9.5,56.4); // creates object of class aircraft
        aircraft piperSaratoga = new aircraft(5,201,102.5,20.5);
		
		double aircraftEndurance;
		
		//cessna172.passengers = 15;
		//System.out.println("Updated Passenger Count For cessna172 is: " + cessna172.passengers);
		
		//cessna172.getPassengers(15);
		
		aircraft.wings = 2;
		System.out.println("All aircrafts have " + aircraft.wings);
		
		System.out.println(cessna172.wings);
		System.out.println(piperSaratoga.wings);
		
		
		/*
		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 141;
		cessna172.fuelBurnRate = 9.5;
		cessna172.fuelCapacity = 56.4; 
		
		piperSaratoga.passengers = 5;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		*/
		
		//aircraftEndurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
		
		//System.out.println("Maximum Time that the cessna172 can stay in air is: " + aircraftEndurance + " hrs");
		
		
		System.out.println("To cessna172 to fly 3 hrs it needs " + cessna172.fuleNeeded(3.0) + " gallons of fule.");
		
	
	}
	
}

class aircraft {
    int passengers;  // number of people
    int cruiseSpeed;    // miles per hour
    double fuelCapacity; // gallons
    static double fuelBurnRate; // gallons per hour
	static int wings;
	
	aircraft(int p,int cs,double fbr,double fc){
		passengers = p;
		cruiseSpeed = cs;
		fuelBurnRate = fbr;
		fuelCapacity = fc;
	}
	
	static double fuleNeeded(double time){
		
		return time * fuelBurnRate;
	
	}
	
	void getPassengers(int p){
		if ((p > 0) && (p <= 10)) {
			passengers = p;
			System.out.println("New Passenger Count is: " + passengers);
		} else {
			System.out.println("Error Getting Passengers.");
		}
	}
}

