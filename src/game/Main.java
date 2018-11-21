package game;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		Player player = new PlayerComp("Mikolaj");
		Player player2 = new PlayerComp("Mikolaj");
		Player player3 = new PlayerComp("Mikolaj");
		game.addPlayer(player);
		game.addPlayer(player2);
		game.addPlayer(player3);
		game.removePlayer(player.getName());
		game.play();
		
	//  Poczytac o typach uogólnionych 	
		
		
	//	List<String> list = new ArrayList();
		
	//	list.add("raz");
	//	list.add("dwa");
	//	list.add("trzy");
		
		//System.out.println(list);
		
//		for(int i  = 0; i<list.size(); i++ )
//		{
//			System.out.println(list.get(i));
//	}
		
//		for(String o : list) {
		//	System.out.println(o);
	//	}
		
	}
}
