package game;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		Player gracz = new PlayerComp();
		
		
		try {
			gracz.setName("Mikolaj");
		}
		catch(IllegalArgumentException e){
			System.err.println("Error! --> " + e.getMessage());
		}
		

		int x, y;
		
		x = rand.nextInt(6) + 1;
		
		while (true) {
			
			System.out.println("Rolled number: " + x);
			y = gracz.guess();
			System.out.println("Player guess: " + y);
			if (y == x) {
				System.out.println("Well done, " + gracz.getName()+ "\n");
				break;
			} else {
				System.out.println("Guess again!\n");
			}
		}
	}

}
