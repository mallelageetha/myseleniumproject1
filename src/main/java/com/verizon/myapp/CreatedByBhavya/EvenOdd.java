package com.verizon.myapp.CreatedByBhavya;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int noOfOdd=0;
		int noOfEven=0;
		
		int arr[] = {1,2,3,4,5};
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				noOfEven=noOfEven+1;
				
			}
			else
			{
				noOfOdd=noOfOdd+1;
			}	
		}
		System.out.println("No of even =" +noOfEven);
		System.out.println("No of odd =" +noOfOdd);
		
		
				
		
		
	}

}
