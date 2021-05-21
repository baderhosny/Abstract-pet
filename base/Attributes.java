import java.io.*;
import java.util.*;

public abstract class Attributes implements java.io.Serializable
{
	protected int value;
	
	public Attributes(){
		value = 4;
	}
	public Attributes(int value){
		this.value = value;
	}
	public void incValue(int amt){
		value += amt;
	}
	public void decValue(int amt){
		value -= amt;
	}
	public int getValue(){
		return value;
	}
	public String getState(){
		return "States";
	}
}
	

