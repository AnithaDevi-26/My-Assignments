package week1.day1;

public class IsPrime {
public static void main(String[] args) {
	
int n=144;
for(int i=2 ; i<n ;) {
	//System.out.print(n);
	
	if (n%i == 0) {
		System.out.print(n);
		System.out.println(" Not a prime");
		break;
	}
	else {
		System.out.print(n);
			System.out.println(" is a Prime");
			break;
		}
	
}
	
}
}

