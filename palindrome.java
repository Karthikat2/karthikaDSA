import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

//palindrome

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int number=n;

int sum=0;
while(n>0){
    int ld=n%10;
    sum=10*sum+ld;
    n=n/10;
}
if(number==sum){
    System.out.print("palindrome");
}
else{
    System.out.print("Not a palindrome");
}

	}
}
