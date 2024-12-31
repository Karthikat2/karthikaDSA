import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//sum of an array

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int [] a=new int[n];
for(int i=0;i<n;i++){
    a[i]=scan.nextInt();//enter user input
}int sum=0;
for(int i=0;i<n;i++){
    sum=sum+a[i];
    System.out.println(a[i]);
}    System.out.println(sum);

	}
}
