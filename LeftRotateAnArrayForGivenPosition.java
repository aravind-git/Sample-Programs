package sample;

import java.util.Scanner;

public class LeftRotateAnArrayForGivenPosition {

	private static Scanner sc;

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
        sc = new Scanner(System.in);
        System.out.println("How many positions");
        int pos=sc.nextInt();
        for(int i=0;i<pos;i++){
         leftRotate(arr);
        }    
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
	}
	
	public static  void leftRotate(int arr[] ){
		System.out.println("in");
	    int i , temp;
	    temp=arr[0];
	    for(i=0;i<arr.length-1;i++){
	        arr[i]=arr[i+1];
	    }
	    arr[i]=temp;
	    
	}
}

