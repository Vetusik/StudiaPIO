package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

	protected Random rand = new Random();
    protected List<Player> players = new ArrayList();
    
//-----------------------------------------------------------------------------------------	
	public void addPlayer(Player player)
	{
		
		if (player != null) {
			if(!isNameExists(player.getName())) {
				players.add(player);
				}
			else {
				player.setName(player.getName() + rand.nextInt(10));
				players.add(player);
					
			}
			}
			
		else
		    throw new IllegalArgumentException("Player cannot be null\n");

	}
//--------------------------------------------------------------------------------------	
	private boolean isNameExists(String name)
	{
		
		for(Player player : players) {
			if(player.getName().equals(name))
				return true;
		}
		return false;
	}
	
//----------------------------------------------------------------------------------------	
	public void removePlayer(String name) {
		
		for(Player player : players) {
			if(player.getName().equals(name)) {
			players.remove(player);
			break;}
		}
		
	}
//---------------------------------------------------------------------------------------		
	public void play()
	{		
		
		int x, y;		
		x = rand.nextInt(6) + 1;
		boolean oneMore;
		
		
		do {	
			oneMore = true;
			System.out.println("Rolled number: " + x);
			
			for(Player player : players) {
			y = player.guess();
			System.out.println("Player guess: " + y);
			
			if (y == x) {
				System.out.println(player.getName() + ", well done,\n");
				oneMore = false;
			} else {
				System.out.println(player.getName() + ", guess again!\n");
			}
			}
		}while(oneMore);
		
	}
}





//try {
//player.setName("Mikolaj");
//}
//catch(IllegalArgumentException e){
//System.err.println("Error! --> " + e.getMessage());
//}
//catch(Exception e) {
//System.err.println("An unknown error ocurred!");
//}