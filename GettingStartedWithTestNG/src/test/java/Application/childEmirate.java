package Application;

public class childEmirate extends parentAirline {

	public static void main(String[] args) {
		childEmirate obj=new childEmirate();
		obj.safetyGuide();
		obj.bodyColor();
		obj.engine();

	}

	@Override
	public void bodyColor() {
		System.out.println("red color");
		
	}

}
