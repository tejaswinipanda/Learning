import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testClass {
	@Test
	public void test1() {
		alertPouupHandel aler=new alertPouupHandel();
		aler.alert(); 
	}
	
	@Test
	public void drag() throws InterruptedException {
		dragAndDrop d1=new dragAndDrop();
		d1.drag();
	}
	

}
