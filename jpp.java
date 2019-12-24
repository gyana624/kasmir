import java.io.*;

Public class prime_numer
{
public static void main(String []args)
{
for(int i=2;i<=100;i++)
{
if((i%2!=0 || i==2)&&(i%3!=3 || i==3)&&(i%5!=5 || i==5) && (i%7!=7 || i==7))
{
System.out,println(i);
}
}
}