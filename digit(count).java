import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* count digits in Number
n=78654-count=5
n=34-count=3
*/

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int count=0;
while(n>0){
    int ld=n%10;
    n=n/10;
    count=count+1;
}
System.out.print(count);
}}

