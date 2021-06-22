 package Application;

import org.testng.annotations.Test;

public  class interfaceImplimentation implements  cenTraffic, centralTraffic{

	public static void main(String[] args) {
		cenTraffic obj=new interfaceImplimentation();
		obj.greemGo();
		obj.refStop();
		obj.flashYellow();
		
		interfaceImplimentation obj1=new interfaceImplimentation();
		obj1.myClass();
		
	}

	public void greemGo() {
		System.out.println("Go greemn light");
		
	}

	public void refStop() {
		System.out.println("Stop red light");
		
	}

	public void flashYellow() {
		System.out.println("Yellow light");
		
	}
	public void myClass() {
		System.out.println("This is my own method");
		
		
	}

	@Test
	public void testCon() {
		// TODO Auto-generated method stub
		
	}

}
 