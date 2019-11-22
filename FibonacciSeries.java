import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	System.out.println("Enter any number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("The Fibonacci sequence:");
	int first=0,last=1,sum=0;
	for(int i=0;i<=n;i++)
	{
		System.out.print(first+" ");
		sum=first+last;
		first=last;
		last=sum;
	}
	}

}
