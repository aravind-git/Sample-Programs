package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumPossibleNumberInaArray {
public static void main(String[] args) {
    Integer[] VALUES = {5, 2, 1, 9, 50, 56 };
    String result = "";
    Arrays.sort(VALUES, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			String s1=o1.toString();
			String s2=o2.toString();
			
			return (s1+s2).compareTo(s2+s1)*-1;
		}

		
    	
	});
    for(int i:VALUES){
    	result+=String.valueOf(i);
    }
    System.out.println(result);
}
}
