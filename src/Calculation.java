import java.util.Scanner;
public class Calculation {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int firstSide,secondSide;
		
		firstSide = input.nextInt();
		
		secondSide = input.nextInt();
		
		input.close();
		
		if (firstSide==secondSide) {
		
			System.out.println("This values already represent a square.");
		}
		
		else {
		
			findMinSquareNumber(firstSide,secondSide);
			findMaxSquareNumber(firstSide,secondSide);
		
		}

	}
	public static void findMinSquareNumber(int a, int b){
		
		if (a!=0 && b!=0) {
		
			System.out.println((int)(Math.max(a, b)/Math.min(a, b))+ " pcs " + Math.min(a, b)+" * "+Math.min(a, b) + " square.");
			
			if (a>b) {
				a=a%b;
				findMinSquareNumber(a,b);
			}
			else if (b>a) {
				b= b%a;
				findMinSquareNumber(a,b);
			}
			
		}
	}
	public static void findMaxSquareNumber(int a, int b) {
		
		int gcd = 0;
		
		for(int i = 1; i <= a && i <= b; ++i){
			
            if(a % i == 0 && b % i == 0)
                gcd = i;
        } 
		
        System.out.println((a/gcd)*(b/gcd) + " pcs " +gcd+ " * " +gcd+" square.");
	}
}

