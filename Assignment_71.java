package stringFunctionss;

import java.util.Date;
/*WAP to display time and date. Store day,date,month year values in String*/

public class Assignment_71 {

	public static void main(String[] args) {
		System.out.println("Show System Time date day");
		Date d1 = new Date();
		System.out.println(d1.getTime()); // epoch time,we need to convert
		// 1000-ms,60-min,60-seconds,24-hours in a day,1-1 day
		Date d2 = new Date(d1.getTime() - (1000 + 60 * 60 * 24 * 5));
		System.out.println(d2); // BODMAS
		String mydate = d2.toString();
		String year = mydate.substring(24);
		System.out.println(year);

		String month = mydate.substring(4, 7);
		System.out.println(month);

		String date = mydate.substring(8, 10);
		System.out.println(date);

		String day = mydate.substring(0, 3);
		System.out.println(day);

		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("/".concat(month).concat("/".concat(year))));
		System.out.println(date.concat("-".concat(month).concat("-".concat(year))));

	}

}
