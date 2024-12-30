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
int sum=1;
for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0){
        sum=sum+i;
        if(n/i!=i){
            sum=sum+(n/i);
        }}
}if(sum==n){
    System.out.print("perfect number");
}else{
    System.out.print("not a perfect number");
}

}
}
