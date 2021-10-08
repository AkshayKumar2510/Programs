import java.io.*;
import java.util.*;

public class StandardDeviation {

    public static void main(String[] args) {
	int n;
	double sum=0,u,m,ms=0,am,o;
	Scanner sc=new Scanner(System.in);
	System.out.print("Entries expected:");
	n=sc.nextInt();
	int[] x=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		sum=sum+x[i];
	}
	u=sum/n;
	for(int i=0;i<n;i++)
	{
		m=Math.pow((x[i]-u),2);
		ms=ms+m;
	}
	am=ms/n;
	o=Math.sqrt(am);
	System.out.println("StandardDeviation "+String.format("%.1f",o));
    }
}
/*
Entries expected:5
12
13
11
10
12
StandardDeviation 1.0
*/