package DateChange;
import java.util.Random;
import java.util.ArrayList;
public class WeatherGenerator {
	public String[] cond = new String[6];
	public ArrayList<Long> input= new ArrayList<Long>();
	public ArrayList<String> string= new ArrayList<String>();
	
	public WeatherGenerator()
	{
		cond[0]="a sunny day with an average temperature of 85 degrees.";
		cond[1]="a cloudy day with an average temperature of 70 degrees.";
		cond[2]="a windy day with an average temperature of 62 degrees.";
		cond[3]="a rainy day with an average temperature of 58 degrees.";
		cond[4]="a humid day with an average temperature of 93 degrees.";
		cond[5]="a snowy day with an average temperature of 27 degrees.";
	}
	
	public String condition(){
		Random rand = new Random();
		int x= rand.nextInt(5);		
		return cond[x];
		}
	public String rememberLie(long elapsed){
		for (int i=0;i<input.size();i++){
			if (elapsed==input.get(i)){
				return string.get(i);
				}	
		}
		input.add(elapsed);
		String r=condition();
		string.add(r);
		return r;
		
	}

}
