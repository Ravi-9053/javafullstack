/*
class B
{
public static void main(String[] args)
{
for(int i=0;i<10;i++)
{
System.out.println("Bright IT Career");
}
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int a=5,b=10;
System.out.println("a==b: " +(a==b));
System.out.println("a!=b: " +(a!=b));
}
}
*/
/*
class B
{
public static void main(String[] args)
{
for(int i=1;i<=20;i++)
{
if(i%2==0)
System.out.println(i + " is Even");
else
System.out.println(i + " is Odd");
}
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int a=10,b=25,c=15;
int largest=(a>b && a>c)? a:(b>c ? b:c);
System.out.println("Largest: "+ largest);
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int i=10;
while(i<=100){
if(i%2==0)
System.out.println(i);
i++;
}
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int i=1;
do{
System.out.println(i);
i++;
}
while(i<=10);
}
}
*/

/*
class B
{
public static void main(String[] args)
{
int num = 153, original = num, sum = 0;
while (num > 0) 
{
int digit = num % 10;
sum += digit * digit * digit;
num /= 10;
}
System.out.println(original + (sum == original ? " is " : " is not ") + "an Armstrong number");
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int n = 17;
boolean isPrime = true;
for (int i = 2; i <= n / 2; i++) 
{
if (n % i == 0) 
{
isPrime = false;
break;
}
}
System.out.println(n + (isPrime ? " is " : " is not ") + "a Prime number");
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int num = 121, rev = 0, original = num;
while (num != 0) {
    rev = rev * 10 + num % 10;
    num /= 10;
}
System.out.println(original + (original == rev ? " is " : " is not ") + "a Palindrome");
}
}
*/
/*
class B
{
public static void main(String[] args)
{
int number = 4;
switch (number % 2) 
{
case 0:
System.out.println("Even");
break;
case 1:
System.out.println("Odd");
break;
}
}
}
*/
/*
class B
{
public static void main(String[] args)
{
char gender = 'M';
switch (gender) 
{
case 'M':
System.out.println("Male");
break;
case 'F':
System.out.println("Female");
break;
default:
System.out.println("Invalid input");
}
}
}
*/
class B
{
public static void main(String[] args)
{
int a = 10, b = 20, c = 30;
if (a > b && a > c)
System.out.println("Largest is: " + a);
else if (b > c)
System.out.println("Largest is: " + b);
else
System.out.println("Largest is: " + c);
}
}
