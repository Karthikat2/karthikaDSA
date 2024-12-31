import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//count and add values (add each value by 5)

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
}int count=0;
for(int i=0;i<n;i++){
   count=count+1;
   int add=a[i]+5;
  //  System.out.println(a[i]);
    System.out.println(add);
}    System.out.println(count);
 


	}
}
