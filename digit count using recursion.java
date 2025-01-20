import java.util.*;
import java.lang.*;
import java.io.*;
//count digit of number using recursion 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n=0;
        System.out.println(count( n));
    }
    public static int count(int n){
        if (n==0){
            return 1;
        }
        if(n<0){
            return count(-n);
        }
        else{
            return countdigit(n,0);
        }
    }
    public static int countdigit(int n,int count){
        if(n==0){
            return count;
        }
        else{
            return countdigit(n/10,count+1);
        }
	}
}
