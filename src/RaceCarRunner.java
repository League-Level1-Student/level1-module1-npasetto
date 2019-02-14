import java.util.Random;

public class RaceCarRunner {
	public static void main(String[] args) {
		int meters=0;
		Random rand = new Random();
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
	RaceCar car = new RaceCar("stuff",5);
	while(true) {
		System.out.println(meters);
		// 2. Print the RaceCar's position in the race
System.out.println(car.getPositionInRace());
		// 3. Crash the RaceCar
		car.crash();
		meters+=10;
		// 4. If the car is damaged. Bring it in for a pit stop.
        if(car.isDamaged()) {
        	car.pit();
        	meters+=5;
        }
		// 5. Help the car move into first place.
       for (int i = 0; i < 4; i++) {

           if(rand.nextInt(5)==0) {
        	   car.crash();
        	   meters+=10;
           }else {
        	   car.overtake();
        	   meters+=50;
           }
           meters+=100;
           if(car.getPositionInRace()==1) {
        	   System.out.println("You won!");
        	   System.out.println("You traveled "+meters+" meters");
        	   System.exit(0);
           }
	}
     
		}
	}
}
