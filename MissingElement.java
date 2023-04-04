package week1.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int [] arrayset = {1,2,3,4,7,6,8};
		Arrays.sort(arrayset); //1,2,3,4,6,7,8
		
		for (int i=1; i<arrayset.length; i++) {
			
			if(i!=arrayset[i-1]) {
				System.out.println(i);
				
				break;
			}
		}
	}

}
