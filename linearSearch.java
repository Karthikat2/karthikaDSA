import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//linear search or search for number

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int x=scan.nextInt();

int [] a=new int[n];

for(int i=0;i<n;i++){
    a[i]=scan.nextInt();//enter user input
   
}int flag=-1;
for(int i=0;i<n;i++){
  if(x==a[i]){
    flag=i;
  }
  
 
}if(flag==-1){
     System.out.println("Not present");
}
else{
      System.out.println(flag);
  }
	}
}
