import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan= new Scanner(System.in);
int size=scan.nextInt();
switch(size){
    case 29:
        System.out.println("Small");
        break;
   case 30:
       System.out.println("Medium");
       break;
    case 38:
    System.out.println("Large");
       break;
       case 42:
           System.out.println("XLarge");
           break;
           default:
           System.out.println("Invalid");
           break;
}
	}
}
