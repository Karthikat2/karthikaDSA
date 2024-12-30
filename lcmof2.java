import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//trailing zero
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int gcd=1;
for(int i=2;i<=a;i++){
    if(a%i==0 && b%i==0){
        gcd=i;
    }
}
int lcm=(a*b)/gcd;
System.out.print(lcm);
}
}
