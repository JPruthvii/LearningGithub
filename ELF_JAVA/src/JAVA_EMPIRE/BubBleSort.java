package JAVA_EMPIRE;

public class BubBleSort {
	public static void main(String[] args) {
		int[]arr={10,2,34,233,4,234,2,8};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		for (int k = 0; k < arr.length; k++)
		{
		 System.out.println(arr[k]);	
		}
	}
}
