/*
public class Strings
{
public static void main(String[] args)
{
String s1="Hello";
String s2=new String("World");
char[] arr={'J','a','v','a'};
String s3=new String(arr);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s1="Hello";
String s2="World";
String result=s1+" "+s2;
System.out.println(result);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="Programming";
int length=s.length();
System.out.println("Length:"+length);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="WelcomeToJava";
String sub=s.substring(7,9);
System.out.println("Substring:"+sub);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="LearnJavaProgramming";
int index=s.indexOf("Java");
System.out.println("Index of 'Java':"+index);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="abc123";
boolean match=s.matches("[a-z]+\\d+");
System.out.println("Matches pattern:"+match);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s1="Hello";
String s2="hello";
System.out.println("Equals:"+s1.equals(s2));
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s1="Hello";
String s2="hello";
System.out.println("IgnoreCase:"+s1.equalsIgnoreCase(s2));
System.out.println("StartsWith He:"+s1.startsWith("He"));
System.out.println("EndsWith lo:"+s1.endsWith("lo"));
System.out.println("CompareTo:"+s1.compareTo(s2));
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="  Java  ";
String trimmed=s.trim();
System.out.println("Trimmed:'"+trimmed+"'");
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="banana";
String replaced=s.replace('a','o');
System.out.println("Replaced:"+replaced);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
String s="apple,banana,grape";
String[] parts=s.split(",");
for(String part:parts)
{
System.out.println(part);
}
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
int num=100;
String s=String.valueOf(num);
System.out.println("String:"+s);
}
}
*/

/*
public class Strings
{
public static void main(String[] args)
{
Integer val=200;
String s=val.toString();
System.out.println("String:"+s);
}
}
*/

public class Strings
{
public static void main(String[] args)
{
String s="Java";
System.out.println("Upper:"+s.toUpperCase());
System.out.println("Lower:"+s.toLowerCase());
}
}
