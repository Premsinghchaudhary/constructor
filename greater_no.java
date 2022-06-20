//Write a program by using constructor
//Create a class which implement the process of greater between 5 No 
package construtor;

import java.util.Scanner;

public class greater_no {

	public static void main(String[] args) {
		 greater_no obj=new greater_no();
       

	}
	public static void  greater_no() 
	{
       
		System.out.print("Please enter the five  numbers : ");
    	Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length;i++)
        {  
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
                if (arr[i] > max)
                 max = arr[i];
         }
         System.out.println("The greatest number is :  "+max);
	}
	

}
