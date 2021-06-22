import org.openqa.selenium.support.ui.WebDriverWait;

public class arrayHandling {
	static int []a= {1, 2, 3, 4, 5,6};
	//static int [][]a1= new int[3][4];
	static int [][]a1= {{1,2,3,4},{6,7,8,9},{1,0,9,8},{3,4,5,6}};

	public static void main(String[] args) {
		printArray();
		printArrayMulti();	
			
		}
	public static void printArray() {
	for(int i=0;i<a.length;i++) {
		System.out.println("The values in araay "+a[i]);
	}
	}
	public static void printArrayMulti() {
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.println("The values in multi araay the i row is "+i+" The j row is "+j+" the value is "+a1[i][j]);
			}
			System.out.println("");
			
		}

	}
	
	
}
