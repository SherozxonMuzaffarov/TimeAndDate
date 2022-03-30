import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		// TimeFormat->DEFAULT/SHORT/MEDIUM/LONG/FULL
//		Date date = new Date();
//		DateFormat df =DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.getDefault());  
//		System.out.println(df.format(date));
//		
		// DateFormat->SHORT/MEDIUM/LONG/FULL
//		DateFormat c= DateFormat.getDateInstance(DateFormat.SHORT);
//		System.out.println(c.format(date));
		
		
		
//		LocalDate l = LocalDate.now();
//		System.out.println(l);
//		
//		LocalTime ll = LocalTime.now();
//		System.out.println(ll);
//		
//		LocalDateTime lll= LocalDateTime.now();
//		System.out.println(lll);
		
		
		
//		// FormatStyle->SHORT/MEDIUM/LONG/FULL
//		LocalDate x = LocalDate.now();
//		System.out.println(x.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
//		
//		LocalTime t = LocalTime.now();
//		System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		
		LocalDateTime n = LocalDateTime.now();
		System.out.println(n.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
	}

}
