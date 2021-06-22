import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapImplimentation {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Sweety");
		hm.put(0, "this");
		hm.put(2, "is");
		hm.put(3, "my");
		hm.put(4, "name");
		System.out.println(hm.get(2));
		hm.remove(4);
		System.out.println(hm);
		Set sn = hm.entrySet();
		Iterator i=sn.iterator(); 
		while(i.hasNext())
		{
			Map.Entry mp= (Map.Entry)i.next();
			System.out.print(mp.getKey()+" ");
			System.out.println(mp.getValue());
		}





	}

}
