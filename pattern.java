import java.util.*;
class Mains
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=1,m=1,k=0;

for(int i=0;i<=(2*n);i++)
{
if(i>5){
m=((i-n+1)*2)-1;}
for(int j=0;j<=(2*n);j++)
{
 k=0;
k=i-n;
if(i<=4 && j<=4)
{
if(i+j>=n-1)
System.out.print("*");
else
System.out.print(" ");
}
else if(i<=4 && j>5)
{
if( j-n-1<=i)
System.out.print(i+(j-n));
else
System.out.print(" ");
}
else if(i>4 && j<=4)
{
if(j>=(i-n))
System.out.print(i-j);
else
System.out.print(" ");
}
else if(i>=5 && j>5)
{
if((i-n)+(j-n)<=n)
{
System.out.print(m);
m=m+2;
}
else
System.out.print(" ");
}
}
System.out.println();
}
}
}
