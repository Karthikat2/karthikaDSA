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
}int large=a[0],small=a[0];
for(int i=0;i<n;i++){
    if(large>a[i]){
        large=a[i];
    }
    else if(small<a[i]){
        small=a[i];
    }
}
System.out.println("large is " +large);
System.out.println("small is " +small);
	}
}
