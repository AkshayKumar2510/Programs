import java.util.*;
import java.io.*;
class snake
{	public static void main(String...args)
	{ int n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number: ");
	 n=sc.nextInt();
	for(int i=0;i<n;i++)//mouth
	{
		for(int j=n-i;j>=0;j--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
	System.out.println();
	}
	for(int i=0;i<n;i++)
	{
		if(i==n-2)
		{break;}
		for(int j=0;j<=i+1;j++)
		{
			System.out.print(" ");
		}
		for(int j=n;j>i;j--)
		{
			System.out.print("* ");
		}
	System.out.println();
	}
	//tail
	for(int z=1;z<3;z++)
	{	
	for(int i=0;i<n;i++)
	{
		for(int j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=2;j++)
		{
			System.out.print("*");
		}
	System.out.println();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=2;j++)
		{
			System.out.print("*");
		}
	System.out.println();
	}
	}
	}
}