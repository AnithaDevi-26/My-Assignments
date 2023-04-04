package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		
		int [] numset1 = {3,2,11,4,6,7}; //Array1 declaration
		int [] numset2 = {1,2,8,4,9,7}; ///Array1 declaration
		for(int i=0; i< numset1.length; i++) { //Array 1 Loop
			for (int j=0; j< numset1.length; j++)  //Array 2 Loop
			{
				if (numset1[i] == numset2[j]) // Condition check
			System.out.println("The match item in both arrays is " + numset1[i] );
			}
		}
	}

}
