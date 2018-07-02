package sample;

import java.util.Scanner;

public class Fibbo{
	public static void main(String[] args) {
		int a=-1;
		int b=1;
		int c,i = 0;
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		while(i<pos){
			 c=a+b;
			a=b;
			b=c;
			i++;
			System.out.println(c);
		}
	}
}