import java.util.*;
import java.io.*;

public class Pet{

	protected Hunger hunger;
	protected Mood mood;
	protected Energy energy;
	protected String name;

	public Pet(){
		this.hunger = new Hunger();
		this.mood = new Mood();	
		this.energy = new Energy();
		this.name = "";
	}
	public Pet(String name, int hunger, int mood, int energy){
		this.hunger = new Hunger(hunger);
		this.mood = new Mood(mood);
		this.energy = new Energy(energy);
		this.name = name;
	}
//	public void sleep();
//	public void eat();
//	public void play();

	
}	
