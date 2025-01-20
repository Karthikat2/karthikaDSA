import java.util.*;
import java.lang.*;
import java.io.*;
//sum of digit of a number using recursion 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n=100601;
        System.out.println(sumofdigit( n));
    }
    public static int sumofdigit(int n){
        if (n==0){
            return 0;
        }
        return n%10+sumofdigit(n/10);
	}
}
