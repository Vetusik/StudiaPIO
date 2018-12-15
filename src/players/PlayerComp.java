package players;

import java.util.Random;

public class PlayerComp extends Player{
	
	private final Random randomNumber = new Random();

	public PlayerComp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerComp(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guess() {
		return randomNumber.nextInt(6)+1;
	}
	
	

}
