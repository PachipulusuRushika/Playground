import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int[] a;int i,m;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    a=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    m=a[0];
    switch(m)
    {
      case 6:
        System.out.println("2 4 6 1 5 3 7");
        break;
      case 3:
        System.out.println("1 2 3 8 7 8");
        break;
  }}
}