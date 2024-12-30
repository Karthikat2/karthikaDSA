import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
int n=150;
int [] a=new int [150];
for(int i=2;i<=Math.sqrt(n);i++){
   if( a[i]==0){
       for(int j=i*2;j<n;j=j+i){
           a[j]=1;
       }
   }
}
for(int i=2;i<n;i++){
    if(a[i]==0){
        System.out.print(i+" ");
    }
}
	}
}
