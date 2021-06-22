
public class stringMethods {
	public void reverseStrin(String a)
	{
		int len=a.length();
		String revString="";
		for(int i=len-1;i>=0;i--)
		{
			revString=revString+a.charAt(i);
		}
		System.out.println("the reverse of the String is:"+revString);
	}
	public void pallendrum(String b)
	{
		int len=b.length();
		String revString="";
		for(int i=len-1;i>=0;i--)
		{
			revString=revString+b.charAt(i);
		}
		if(b.equals(revString))
		{
			System.out.println("The given string "+ b+" is a pallendrum");
		}
		else
		{
			System.out.println("The given string "+ b +" is not a pallendrum");
		}
	}
	
	public void halfPyramidStar(int row)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void halfPyramidNumber(int row)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void invertedHalfPyramid(int row)
	{
		for(int i=row;i>=1;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void sortingNumber(int a[]) {
		int len=a.length;
		int temp;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++) {
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}
	public void smallesNumber(int a[])
	{
		int temp;  //{5,10, 8)
		//int temp1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
		}
		System.out.println("The smallest number in the array is \t"+a[0]);
	}
	public void smallNumberMultiArray(int arr[][]) 
	{
		int temp =arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if (arr[i][j]<temp)
				{
					temp=arr[i][j];
					
				}
				
			}
			
		}
		System.out.println("The smallest number in the array is \t"+temp);
		
	}
	
	public void maxColNumOfMinNumRow(int arr[][])
	{
		int temp =arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if (arr[i][j]<temp)
				{
					temp=arr[i][j];
					int minCol = j;
										
					
				}
				
			}
			
		}
//		int max=
		////int k;
		//while(k<))
		
		
	}

	public static void main(String[] args) {
		String str="   This is tejaswini";
		/*System.out.println(str.substring(1, 5));
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("p"));
		System.out.println(str.trim());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String str1[] =str.split("a");
		System.out.println(str1.length);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		//System.out.println(str1[2]);
		System.out.println(str.replace("t","s"));*/
		stringMethods obj=new stringMethods();
		obj.reverseStrin(str);
		obj.pallendrum("madam");
		obj.pallendrum("tejaswini");
		obj.halfPyramidStar(5);
		obj.halfPyramidNumber(5);
		obj.invertedHalfPyramid(5);
		int arr[]={20,30,10,50,5};
		obj.sortingNumber(arr);
		obj.smallesNumber(arr);
		int arr1[][] ={{2,3,4},{3,4,5},{5,6,0}};
		obj.smallNumberMultiArray(arr1);
	}

}
