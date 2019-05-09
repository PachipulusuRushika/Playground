import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      int i,j,val;Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      val=in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i]+a[j]==val)
          {
            System.out.println(a[i]+", "+a[j]);
          }
        }
          }
    }}