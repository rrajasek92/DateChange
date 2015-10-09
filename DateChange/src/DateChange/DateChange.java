package DateChange;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChange{

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("MM/dd/YYYY"+"\n"+"HH:mm");
		System.out.println(df.format(now));
	}

}