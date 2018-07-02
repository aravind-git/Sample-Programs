package sample;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String args[]) {
        
}   
public static  int[] leftRotate(int arr[], int n ){
    int i , temp;
    temp=arr[0];
    for(i=0;i<n;i++){
        arr[i]=arr[i+1];
    }
    arr[n]=temp;
    return arr;
}
}