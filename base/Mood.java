public class Mood extends Attributes
{
	
	public Mood(){
		super();
	}
	public Mood(int value){
		super(value);
	}
	public String getState(){
		if(value <= 3 && value >= 0)
		{
			return "Not happy";
		}
		else if( value >=4 && value <=7)
		{
			return "Normal";
		}
		else 
		{
			return "happy";
		}
	}
} 
