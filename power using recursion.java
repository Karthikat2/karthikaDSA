import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in)	;
	
		int a=scan.nextInt();
	    int b=scan.nextInt();
	    System.out.println(pow(a,b));

	}
	public static  int pow(int  a,int b){
	    if(b==0){
	        return 1;
	    }
	    return a*pow(a,b-1);
	}
}
