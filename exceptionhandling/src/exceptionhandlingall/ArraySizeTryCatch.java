package exceptionhandlingall;

import java.util.Scanner;

public class ArraySizeTryCatch {
public static void main(String[] args) {
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter size : ");
	int size=sc.nextInt();
	int arr[] = new int[size];
	//int arr[]= {3,7,12,67};
	try {
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		//System.out.println(arr[i]);
	}
		System.out.println("enter which element you want: ");
		int ele=sc.nextInt();
		ele=arr[ele];
		System.out.println(ele);
	throw new ArrayIndexOutOfBoundsException();
	}
	catch(ArrayIndexOutOfBoundsException e) {
//System.out.println(".......");
		System.out.println(e.getMessage());
	}
}
}
