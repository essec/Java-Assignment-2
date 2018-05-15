abstract class Pokemon{
	protected String name;
	protected int weight;
	protected int mood;
	protected int health;

	public Pokemon(String name, int weight, int mood, int health){
		this.name = name;
		this.weight = weight;
		this.mood = mood;
		this.health = health;
	}

	public String getName(){
		return this.name;
	}

	public int getWeight(){
		return this.weight;
	}

	public int getMood(){
		return this.mood;
	}

	public int getHealth(){
		return this.health;
	}

	public void eat(){
		this.weight += 2;
	}

	public void recovery(){
		this.health = 100;
	}

	public void battle(){
		this.health -= 25;
		this.mood -= 25;
		if(this.health <= 0)
			this.health = 0;
			this.mood = 0;
		if(this.mood <= 0)
			this.mood =0;
	}

	public void happy(){
		this.mood += 20;
		if(this.mood >= 100)
			this.mood = 100;
		if(this.health <= 0)
			this.mood = 0;
	}

	public void reducedWeight(int value){
		this.weight -= value;
		if(this.weight < 15){
			this.weight = 15;
		}
	}

	abstract public void move();
}
