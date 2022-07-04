import java.io.*;
import java.util.Scanner;

public class Add2nos
{
	public static void main(String[] args)
	{
		int a,b,s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 nos. ");
		a=sc.nextInt();
		b=sc.nextInt();
		s=a+b;
		System.out.print("sum = "+s);
	}
}