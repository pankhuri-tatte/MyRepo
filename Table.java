import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int table=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=table*i;
			System.out.println(table+" * "+i+" = "+sum);
		}


	}

}
