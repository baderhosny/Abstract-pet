public class Hunger extends Attributes
{

	public Hunger(){
		super();
	}
	public Hunger(int value){
		super(value);
	}

	public String getState(){
		if(value <= 3 && value >= 0){
			return "Hungry";
		}
		else if(value >=4 && value <= 7){
		
			return "Normal";
		}else{
			return "full";
		}
	}
}
