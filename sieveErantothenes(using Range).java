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
int L=scan.nextInt();
int R=scan.nextInt();
int [] a=new int [R];
for(int i=2;i<=Math.sqrt(R);i++){
    if(a[i]==0){
        for(int j=i*2;j<R;j=j+i){
            a[j]=1;
        }
    }
}
for(int i=L;i<R;i++){
    if(a[i]==0){
    System.out.println(i);
}}

	}
}
