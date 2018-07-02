package sample;

import java.util.ArrayList;

public class InterlapTwoArray {
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		char arr2[]={'a','b','c'};
		ArrayList<String> li=new ArrayList<>();
		for(int i=0;i<arr1.length;i++){
			li.add(String.valueOf(arr1[i]));
			li.add(String.valueOf(arr2[i]));
		}
		for(String s:li){
			System.out.println(""+s);
		}
        li.forEach((a)->System.out.println(a));

	}

}
