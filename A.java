/*class A
{
public static void main(String [] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
*/

/*
class A
{
public static void main(String[]args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
*/
/*
class A
{
public static void main(String[]args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println();
} c
}
}
*/
/*
class A
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}
*/
/*
class A
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+"\t");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}
*/
/*
class A
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(n+" ");
n+=2;
}
System.out.println();
}
}
}
*/
/*
class A
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j%2);
}
System.out.println();
}
}
}
*/
/*
import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
*/
/*
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}
*/
