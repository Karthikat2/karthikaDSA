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
int n=scan.nextInt();
int rev=0;
while(n>0){
    int ld=n%10;
    rev=rev*10+ld;
    n=n/10;
}
System.out.print(rev);

}
}
