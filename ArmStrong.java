package coding;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		int n;
		int count = 0;
		int a,b,c,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		a=n;
		c=n;
		while(a>0) {
			a=a/10;
			count++;
		}
		while(n>0) {
			b=n%10;
			sum=(int) (sum+Math.pow(b,count));
			n=n/10;
		}
		if(sum==c) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
