public class Dog extends Attributes
{
	public Dog(){
		super();
	}
	public Dog(String name, int hunger, int mood, int energy){
		super(name,hunger,mood,energy);
	}

	public void eat(){
		this.hunger.incValue(4);
		this.mood.incValue(2);
		this.energy.incValue(1);
		System.out.println("thanks for the food");
	}
	public void sleep(){
		this.hunger.decValue(3);
		this.mood.incValue(2);
		this.energy.incValue(4);
		System.out.println("ZZzzzz");
	}
	public void play(){
		this.hunger.incValue(2);
		this.mood.incValue(3);
		this.energy.decValue(3);
	}
}	
