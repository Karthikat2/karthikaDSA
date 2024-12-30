import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

for(int i=2;i<=n;i++){
int flag=0;
for(int j=2;j<=Math.sqrt(i);j++){
    if(i%j==0){
    flag=1;}
}
if(flag==0){
    System.out.print(i+" ");
}
}

}
}
