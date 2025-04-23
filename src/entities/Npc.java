package entities;

public class Npc {
	private String name;
	private int fighting;
	private int health;
	private int dmg;

	public Npc(String name, int fighting, int health, int dmg) {
		this.name = name;
		this.fighting = fighting;
		this.health = health;
		this.dmg = dmg;
	}

	public int getFighting() {
		return fighting;
	}

	public int getDmg() {
		return dmg;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
