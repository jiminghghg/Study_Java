package pack02.exarray;

import java.util.Arrays;

public class Ex01_Array {
public static void main(String[] args) {
		int[] array= {3,5,7,9,1,2,4,10};
		int[] tempArray = new int[10];
		for(int i=0; i<array.length; i++) {
			for(int idx=i+1; idx<array.length; idx++) {
				if(array[i]< array[idx]) {
					int temp = array[i];
					array[i]=array[idx];
					array[idx] = temp;
					
				}
			}
	System.out.println(Arrays.to);
		}
		
	}

}