public class Energy extends Attributes
{
	
	public Energy(){
		super();
	}
	public Energy(int value){
		super(value);
	}
	
	public String getState(){
		if(value <= 3 && value >= 0){
			return "Exhausted";
		}
		else if(value >= 4 && value <= 7){
			return "Normal";
		}
		else
		{
			return "Energetic";
		} 
	}	 		
}
