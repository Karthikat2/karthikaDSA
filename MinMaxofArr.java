import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//MinMax of two array and their product

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

int [] a=new int[n];
int [] b=new int[n];
for(int i=0;i<n;i++){
    a[i]=scan.nextInt();//enter user input
    b[i]=scan.nextInt();
}int max=a[0],min=b[0];
for(int i=0;i<n;i++){
   // System.out.println(a[i]);
  //  System.out.println(b[i]);
    

    if(max<a[i]){
        max=a[i];
    }
     if(min>b[i]){
        min=b[i];
    }
 
}
System.out.println(min);

System.out.println(max);
int prod=min*max;
System.out.print(prod);
	}
}
