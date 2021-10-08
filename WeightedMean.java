import java.io.*;
import java.util.*;

public class WeightedMean {

    public static void main(String[] args) {
	int n;
	double mul=0,sum=0,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("Expected entries: ");
	n=sc.nextInt();
	int[] x=new int[n];
	int[] w=new int[n];
	System.out.println("Values:");
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	System.out.println("Weightages:");
	for(int i=0;i<n;i++)
	{
		w[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		mul=mul+x[i]*w[i];
		sum=sum+w[i];
	}
	res=mul/sum;
	System.out.println("Weighted Mean "+String.format("%.1f",res));
    }
}

/*
Expected entries:
4
Values:
80
75
69
87
Weightages:
40
56
30
60
Weighted Mean 79.0
*/