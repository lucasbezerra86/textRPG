package entities;

public class Personagem {
	private int fighting;
	private int health;
	private int luck;
	private int dmg = 2;
	private int maxHp;
	private int healthPotion;
	private String vocation;
	
	
	public Personagem() {

	}

	public Personagem(int fighting, int health, int luck, int dmg) {
		this.fighting = fighting;
		this.health = health;
		this.luck = luck;
		this.dmg = dmg;
	}
	
	public Personagem(int fighting, int health, int dmg) {
		this.fighting = fighting;
		this.health = health;
		this.dmg = dmg;
	}

	public int getHealthPotion() {
		return healthPotion;
	}

	public void setHealthPotion(int healthPotion) {
		this.healthPotion = healthPotion;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getFighting() {
		return fighting;
	}

	public void setFighting(int fighting) {
		this.fighting = fighting;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}


	public void rollAttributes() {
		setFighting(6 + (int) (Math.random() * 6 + 1));

		setHealth(12 + (int) (Math.random() * 10 + 2));

		setLuck(6 + (int) (Math.random() * 6 + 1));

		setMaxHp(getHealth());

	}
	

}
