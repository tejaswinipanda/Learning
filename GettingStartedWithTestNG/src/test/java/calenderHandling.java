import java.util.Calendar;

public class calenderHandling {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DST_OFFSET));
	}

}
