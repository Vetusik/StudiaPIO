package game;

import java.util.Scanner;

public class PlayerHuman extends Player{
	
	private final Scanner kb = new Scanner(System.in);

	public PlayerHuman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerHuman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int guess() {
		 System.out.println("Give number: ");
	     return kb.nextInt();
	}

}
