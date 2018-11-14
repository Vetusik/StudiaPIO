package game;

import java.util.Random;

public class Game {

	protected Player player;
	protected Random rand = new Random();
	
	public void addPlayer(Player player)
	{
		this.player = player;
	}
		
	public void play()
	{		
				
		try {
			player.setName("Mikolaj");
		}
		catch(IllegalArgumentException e){
			System.err.println("Error! --> " + e.getMessage());
		}
		catch(Exception e) {
			System.err.println("An unknown error ocurred!");
		}
		
		int x, y;		
		x = rand.nextInt(6) + 1;
		
		while (true) {			
			System.out.println("Rolled number: " + x);
			y = player.guess();
			System.out.println("Player guess: " + y);
			if (y == x) {
				System.out.println("Well done, " + player.getName()+ "\n");
				break;
			} else {
				System.out.println("Guess again!\n");
			}
		}
	}
}
