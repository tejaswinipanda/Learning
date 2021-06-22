
public class staticDemo {
	
	String name;  //instance variable
	String address;
	static String city ="Banglore";
	
	staticDemo(String name, String address) //local variables
	{
		this.name=name;
		this.address=address;
		this.city=city;
	}

	public void gerAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void main(String[] args) {
		staticDemo obj = new staticDemo("bob", "alkapur");
		staticDemo obj1 = new staticDemo("ram", "manikonda");
		obj.gerAddress();
		obj1.gerAddress();

	}

}
