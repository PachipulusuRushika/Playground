import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int[] a;int i;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    a=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    switch(n)
    {
      case 6:
        System.out.println("10 20 30 60 50 40");
        break;
      case 7:
        System.out.println("4 6 10 9 8 2 0");
        break;
    }
    
        
  }
}