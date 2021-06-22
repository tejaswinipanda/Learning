import java.util.ArrayList;

public class listImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		arr.add(0, 70);
		System.out.println(arr);
		arr.remove(1);
		//		arr.removeAll(arr);
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println(arr.get(2));
		if(arr.contains(30)){
			System.out.println("object present");
		}
		System.out.println(arr.indexOf(30));
			
	}

}
