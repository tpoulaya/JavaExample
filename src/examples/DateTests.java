package examples;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTests {

	public static void main(String[] args) {
		Date d = new Date();
		
		/*//import java.sql.Date;
		String str = "2019-01-31";
		Date ds = Date.valueOf(str);
		System.out.println(ds);*/
		
		String s = DateFormat.getInstance().format(d);
		System.out.println(s);
		String strDate = null;
		SimpleDateFormat formatter = null;
		formatter = new SimpleDateFormat("dd/mm/YYYY");
		strDate = formatter.format(d);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd/MM/YYYY");
		strDate = formatter.format(d);
		System.out.println(strDate);
		
	}

}
