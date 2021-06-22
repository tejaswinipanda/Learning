import java.text.SimpleDateFormat;
import java.util.Date;

public class dateHandling {

	public static void main(String[] args) {
		
		Date d= new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat dd= new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(dd.format(d).toString());
		SimpleDateFormat dd1= new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		System.out.println(dd1.format(d).toString());
		
		
	}

}
