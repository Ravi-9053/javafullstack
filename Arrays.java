/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};
int sum=0;
for(int num:arr)
{
sum+=num;
}
System.out.println("Sum:"+sum);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,4,6,8};
int sum=0;
for(int num:arr)
{
sum+=num;
}
double avg=(double)sum/arr.length;
System.out.println("Average:"+avg);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={10,20,30,40};
int target=30;
int index=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==target)
{
index=i;
break;
}
}
System.out.println("Index:"+index);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={5,10,15};
int value=10;
boolean found=false;
for(int num:arr)
{
if(num==value)
{
found=true;
break;
}
}
System.out.println("Contains:"+found);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,4};
int remove=3;
int[] newArr=new int[arr.length-1];
int j=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=remove)
{
newArr[j++]=arr[i];
}
}
for(int num:newArr)
{
System.out.print(num+" ");
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] original={1,2,3};
int[] copy=new int[original.length];
System.arraycopy(original,0,copy,0,original.length);
for(int num:copy)
{
System.out.print(num+" ");
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,4};
int pos=2,value=3;
int[] newArr=new int[arr.length+1];
for(int i=0,j=0;i<newArr.length;i++)
{
if(i==pos)
newArr[i]=value;
else
newArr[i]=arr[j++];
}
for(int num:newArr)
{
System.out.print(num+" ");
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,5,1,9};
int min=arr[0],max=arr[0];
for(int num:arr)
{
if(num<min)
min=num;
if(num>max)
max=num;
}
System.out.println("Min:"+min+", Max:"+max);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3};
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]+" ");
}
}
}
*/

/*
import java.util.*;
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,2,4,1};
Set<Integer> seen=new HashSet<>();
Set<Integer> dup=new HashSet<>();
for(int num:arr)
{
if(!seen.add(num))
dup.add(num);
}
System.out.println("Duplicates:"+dup);
}
}
*/

/*
import java.util.*;
public class Arrays
{
public static void main(String[] args)
{
int[] arr1={1,2,3};
int[] arr2={2,3,4};
Set<Integer> set=new HashSet<>();
for(int num:arr1)
set.add(num);
Set<Integer> common=new HashSet<>();
for(int num:arr2)
if(set.contains(num))
common.add(num);
System.out.println("Common:"+common);
}
}
*/

/*
import java.util.*;
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,2,3,1};
Set<Integer> set=new LinkedHashSet<>();
for(int num:arr)
set.add(num);
System.out.println("Unique:"+set);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={3,5,2,9,7};
int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
for(int num:arr)
{
if(num>first)
{
second=first;
first=num;
}
else if(num>second&&num!=first)
{
second=num;
}
}
System.out.println("Second largest:"+second);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};
int even=0,odd=0;
for(int num:arr)
{
if(num%2==0)
even++;
else
odd++;
}
System.out.println("Even:"+even+", Odd:"+odd);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={7,1,9};
int min=arr[0],max=arr[0];
for(int num:arr)
{
if(num<min)
min=num;
if(num>max)
max=num;
}
System.out.println("Difference:"+(max-min));
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={5,12,23,1};
boolean has12=false,has23=false;
for(int num:arr)
{
if(num==12)
has12=true;
if(num==23)
has23=true;
}
System.out.println("Contains both:"+(has12&&has23));
}
}
*/

/*
import java.util.*;
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,1,2,3};
Set<Integer> set=new LinkedHashSet<>();
for(int num:arr)
set.add(num);
System.out.println("New array:"+set);
}
}
*/
/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr=new int[99];
int missing=57;
for(int i=0,j=1;j<=100;j++)
{
if(j!=missing)
arr[i++]=j;
}
int expectedSum=100*101/2;
int actualSum=0;
for(int num:arr)
actualSum+=num;
System.out.println("Missing number:"+(expectedSum-actualSum));
}
}
*/
/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={10,20,30,40,50,60,70};
int target=30;
int left=0;
int right=arr.length-1;
boolean found=false;
while(left<=right)
{
int mid=(left+right)/2;
if(arr[mid]==target)
{
found=true;
break;
}
else if(arr[mid]<target)
{
left=mid+1;
}
else
{
right=mid-1;
}
}
System.out.println("Found:"+found);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={7,3,9,1,5};
int first=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
for(int num:arr)
{
if(num>first)
{
second=first;
first=num;
}
else if(num>second && num!=first)
{
second=num;
}
}
System.out.println("Second Largest:"+second);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={10,20,30,5,15};
int max=arr[0];
int min=arr[0];
for(int num:arr)
{
if(num>max)
max=num;
if(num<min)
min=num;
}
System.out.println("Max:"+max+" Min:"+min);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,3,2,1,5,3};
int[] freq=new int[100];
for(int num:arr)
{
freq[num]++;
}
for(int i=0;i<freq.length;i++)
{
if(freq[i]>0)
{
System.out.println(i+":"+freq[i]);
}
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] a={1,2,3,4};
int[] b={3,4,5};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
System.out.println(a[i]);
}
}
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5,6};
int even=0;
int odd=0;
for(int num:arr)
{
if(num%2==0)
even++;
else
odd++;
}
System.out.println("Even:"+even+" Odd:"+odd);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={-2,0,4,-1,3};
int pos=0;
int neg=0;
int zero=0;
for(int num:arr)
{
if(num>0)
pos++;
else if(num<0)
neg++;
else
zero++;
}
System.out.println("Positive:"+pos+" Negative:"+neg+" Zero:"+zero);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,4};
int pos=2;
int val=3;
int[] newArr=new int[arr.length+1];
for(int i=0,j=0;i<newArr.length;i++)
{
if(i==pos)
newArr[i]=val;
else
newArr[i]=arr[j++];
}
for(int n:newArr)
System.out.print(n+" ");
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,4};
int remove=3;
int[] res=new int[arr.length-1];
int j=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=remove)
res[j++]=arr[i];
}
for(int n:res)
System.out.print(n+" ");
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={1,2,3,2,1};
boolean isPalin=true;
for(int i=0;i<arr.length/2;i++)
{
if(arr[i]!=arr[arr.length-1-i])
{
isPalin=false;
break;
}
}
System.out.println("Palindrome:"+isPalin);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[][] a={{1,2},{3,4}};
int[][] b={{5,6},{7,8}};
int[][] res=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
res[i][j]=a[i][j]*b[i][j];
System.out.print(res[i][j]+" ");
}
System.out.println();
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,4,6,8};
int sum=0;
for(int num:arr)
sum+=num;
System.out.println("Sum:"+sum);
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,4,3,5,7};
int target=7;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]+arr[j]==target)
{
System.out.println(arr[i]+" "+arr[j]);
}
}
}
}
}
*/

/*
public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,4,6,1,9};
int val=4;
int count=0;
for(int num:arr)
{
if(num>val)
count++;
}
System.out.println("Greater Elements:"+count);
}
}
*/

public class Arrays
{
public static void main(String[] args)
{
int[] arr={2,4,6,8};
int sum=0;
for(int num:arr)
sum+=num;
double avg=(double)sum/arr.length;
System.out.println("Average:"+avg);
}
}
