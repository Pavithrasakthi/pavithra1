import java.io.*;
import java.util.*;
public class Main
{
public static voidmain(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int num,rem,orig,rev=0;
System.out.println("Enter the num:");
num=sc.nextInt();
orig=num;
while(num!=0)
{
rem%10;
rev=rev*10+rem;
num=num/10;
}
if(rev==orig)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}
