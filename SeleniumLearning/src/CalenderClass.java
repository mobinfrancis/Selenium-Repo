import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MAY));
		System.out.println(cal.get(Calendar.MINUTE));

	}

}
