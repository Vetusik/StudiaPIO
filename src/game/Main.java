package game;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	//	Game game = new Game();
	//	Player player = new PlayerComp();
	//	game.addPlayer(player);
	//	game.play();
		
		
		List list = new ArrayList();
		
		list.add("raz");
		list.add("dwa");
		list.add("trzy");
		
		//System.out.println(list);
		
		for(int i  = 0; i<list.size(); i++ )
		{
			System.out.println(list.get(i));
		}
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
}
