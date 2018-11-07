package game;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		Player gracz = new PlayerComp();
		
		
		try {
			gracz.setName("olek");
		}
		catch(IllegalArgumentException e){
			System.err.println("Wrong name! " + e.getMessage());
		}
		

		int x, y;
		
		x = rand.nextInt(6) + 1;
		System.out.println("Liczba do zgadniecia: " + x);
		
		while (true) {
			
			y = gracz.guess();
			System.out.println("Zgaduje, ze to... " + y);
			if (y == x) {
				System.out.println("Brawo, " + gracz.getName()+ "\n");
				break;
			} else {
				System.out.println("Guess again!\n");
			}
		}
	}

}
