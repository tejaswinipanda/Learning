
public class multiArray {

	public static void main(String[] args) {
		//int arr[][]=new int[3][3];
		int arr[][]= {{2,3,4},{3,4,5},{5,6,7}};
		int row=arr.length;
		//int col=arr.
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		

	}

}
