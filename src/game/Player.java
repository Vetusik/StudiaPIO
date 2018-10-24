package game;

import java.util.Random;

public class Player {

	private String name = "Janusz";

	Player() {
	}

	Player(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
		else
			System.err.println("Wrong name!");
	}

	public int guess() {
		Random rand = new Random();
		int y = rand.nextInt(6) + 1;
		return y;
	}
}
