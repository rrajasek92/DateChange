package DateChange;

import java.util.Date;
import java.util.Scanner;

public class DateActivity {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		WeatherGenerator weatherGen= new WeatherGenerator();
		String d="null",e="y";
		while(e.equals("y")){
		System.out.println("What date do you want to learn about? (MM/DD/YYYY)");
		d = keyboard.next();
		Scanner Parser = new Scanner(d).useDelimiter("/");
		int month=Parser.nextInt()-1;
		int day=Parser.nextInt();
		int year=Parser.nextInt();
		Date now = new Date();
		long nowTime=now.getTime()/(1000*60*60*24);
		now.setDate(day);
		now.setMonth(month);
		now.setYear(year-1900);
		
		int n=now.getDay();
		long thenTime=now.getTime()/(1000*60*60*24);
		long daysBetween=nowTime-thenTime;
		
		String condition=weatherGen.rememberLie(thenTime);
		String DoW=dayOfWeek(n);
		System.out.println("That was a "+DoW+". It was "+condition+" It was "+daysBetween+" days ago.\nAnother one?(y/n)\n");
		e=keyboard.next();
		}
		keyboard.close();
		System.out.println("\n\nClosing Program.....");
	}
	public static String dayOfWeek(Integer a){
		String[] day = new String[7];
		day[0]="Sunday";day[1]="Monday";day[2]="Tuesday";day[3]="Wednesday";day[4]="Thursday";day[5]="Friday";day[6]="Saturday";
		
		return day[a];
	}
	
	
}
