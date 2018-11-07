package game;

public abstract class Player {

	private String name = "DefaultJanusz";
	

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

	abstract int guess();
	
}
