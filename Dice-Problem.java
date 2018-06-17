import java.math.*;
import java.util.Random;

public class Dice {
	int faces;
	String output;
	public Dice(int faces)
	{
		this.faces=faces;
	}
	public void roll()
	{
		Random random = new Random(); 
		int o = random.nextInt(faces)+1;
		output= result(o);
    }
	public String send()
	{
		if(faces==2||faces==4||faces==6)
			return output;
		return ("Dice Not Possible");
	}
	public String result(int num)
	{
		if(faces==2)
		{
			switch (num) 
			{
			case 1:return "HEADS";
			case 2:return "TAILS";	
			}	
		}
		else
		{
			switch (num) 
			{
			case 1:return "ONE";
			case 2:return "TWO";
			case 3:return "THREE";
			case 4:return "FOUR";
			case 5:return "FIVE";
			case 6:return "SIX";
			}	
		}
		return null;
	}
	
	public static void main(String[] args) 
	{  
		Dice d=new Dice(7);
		d.roll();
		System.out.println(d.send());
	}

}
