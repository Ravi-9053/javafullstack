/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public static void staticMethod1()
{
System.out.println("Static Method 1");
}

public static void staticMethod2()
{
System.out.println("Static Method 2");
}

public void instanceMethod1()
{
System.out.println("Instance Method 1");
}

public void instanceMethod2()
{
System.out.println("Instance Method 2");
}

public static void main(String[] args)
{
System.out.println("Main Method");
}
}
*/

/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public static void staticMethod()
{
Static obj=new Static();
System.out.println("x:"+obj.x);
System.out.println("y:"+obj.y);
}

public static void main(String[] args)
{
staticMethod();
}
}
*/

/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public void instanceMethod()
{
System.out.println("a:"+a);
System.out.println("b:"+b);
}

public static void main(String[] args)
{
Static obj=new Static();
obj.instanceMethod();
}
}
*/

/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public void instanceMethod()
{
System.out.println("Instance Method");
}

public static void staticMethod()
{
Static obj=new Static();
obj.instanceMethod();
}

public static void main(String[] args)
{
staticMethod();
}
}
*/

/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public static void staticMethod()
{
System.out.println("Static Method");
}

public void instanceMethod()
{
staticMethod();
}

public static void main(String[] args)
{
Static obj=new Static();
obj.instanceMethod();
}
}
*/

/*
public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public static void main(String[] args)
{
Static obj=new Static();
System.out.println("a:"+a);
System.out.println("b:"+b);
System.out.println("x:"+obj.x);
System.out.println("y:"+obj.y);
}
}
*/

public class Static
{
static int a=10;
static int b=20;
int x=100;
int y=200;

public static void staticMethod()
{
System.out.println("This is static method");
}

public void instanceMethod()
{
System.out.println("This is instance method");
}

public static void main(String[] args)
{
Static obj=new Static();
staticMethod();
obj.instanceMethod();
}
}
