import java.util.HashSet;
import java.util.Iterator;

public class setImplementation {

	public static void main(String[] args) {

		 HashSet<String> hs= new HashSet<String>();
		 hs.add("sweety");
		 hs.add("tej");
		 hs.add("sweet1y");
		 hs.add("tej");
		 System.out.println(hs);
		 hs.remove("sweet1y");
		 System.out.println(hs.size());
		 System.out.println(hs.isEmpty());
		 Iterator<String> i=hs.iterator(); 
		 while(i.hasNext())
		 {
			System.out.println(i.next());
		 }
		 }
		
	}


