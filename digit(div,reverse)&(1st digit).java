import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* divisibility of digit in a number
n=3456
digit=6543(digit from in backward)*/

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
while(n>0){
    int ld=n%10;
   System.out.print(ld);
      
    
    n=n/10;
}
	}
}
/* FIRST DIGIT OF NUMBER LOGIC(ld==n)
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* divisibility of digit in a number
n=3456
digit=6543(digit from in backward)

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
while(n>0){
    int ld=n%10;
   System.out.println(ld);
    if(ld==n){
        System.out.print("first digit "+ld);
    }
    n=n/10;
}
	}
}
*/