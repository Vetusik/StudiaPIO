package game;

import players.PlayerComp;
import statistics.Statistics;
import statistics.WinStatistics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import players.Player;
import statistics.NullStatistics;
import statistics.Statistics;

public class Game {

	protected Random rand = new Random();
    protected List<Player> players = new ArrayList();
    protected Statistics stats;
    
    public Game() {
        this.stats = new NullStatistics();
    }
     
    public Game(Statistics stats) {
        this.stats = stats;
    }
    
//-----------------------------------------------------------------------------------------	
	public void addPlayer(Player player) {
		if (!player.equals(null)) {
			if (!isNameExists(player.getName())) {
				players.add(player);
			} else {
				player.setName(player.getName() + rand.nextInt(10));
				addPlayer(player);
			}
		} else {
			throw new IllegalArgumentException("Player couldn't be added to the list.");
		}
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
		
		Iterator<Player> it = players.iterator();
		while (it.hasNext()) {
			if ( it.next().getName().equals(name)) {
				it.remove();
				break;
			}
		}
		
	}
//---------------------------------------------------------------------------------------	
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
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
			System.out.println("---------------------------------------------------------");
			System.out.println("Rolled number: " + x);
			
			for(Player player : players) {
			y = player.guess();
			System.out.println(player.getName() + " guess: " + y);
			
			if (y == x) {
				System.out.println("Well done!\n");
				oneMore = false;
				stats.andTheWinnerIs(player.getName()); // doliczenie punktu
			} else {
				System.out.println("Guess again!\n");
			}
			}
		}while(oneMore);
		
	}
}