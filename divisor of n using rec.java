import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=10;
div(1,n);
	}
	public static void div(int i,int n){
	    if(i>n){
	        return;
	    }
	    if(n%i==0){
	        System.out.println(i);
	    }
	    div(i+1,n);
	}
}
