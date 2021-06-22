
public class duplicateNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,6,3,4,9,1,2,0,6};
		
		int temp=arr[0];
		int temp1=0;
		int temp2;
		
		for(int i=0;i<arr.length;i++)
		{
			temp2=arr[i];
			if(temp2==arr[i+1])
			{
				temp=(int) arr(i);
				temp1++;
			}
			System.out.println("the integer "+temp2+"repeated "+temp1);
		}
		

	}

	private static Object arr(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
