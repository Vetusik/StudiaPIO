package game;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		Player gracz = new Player(null);

		int x, y;

		while (true) {
			x = rand.nextInt(6) + 1;
			System.out.println("Guess!");
			y = gracz.guess();

			if (y == x) {
				System.out.println("Brawo, " + gracz.getName());
				break;
			} else {
				System.out.println("Again!");
			}
		}
	}

}
