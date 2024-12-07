import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=n;i>=1;i--){
		    for(int j=i;j>=1;j--){
		        System.out.print(j);
		    }
		    System.out.println("");
		}

	}
}
