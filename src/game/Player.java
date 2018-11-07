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
		
		if (name != null && name.matches("^[a-zA-Z][a-zA-Z\\d@\\-_.]{2,30}$"))
			this.name = name;
		else
		    throw new IllegalArgumentException("Nieprawid³owe imie");
	}

	abstract int guess();
	
}
