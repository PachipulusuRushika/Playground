import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int g;
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      if(n1<n2)
      {
        g=n1;
      }
      else
      {
        g=n2;
      }
       if(g<n3)
       {
         System.out.println(g);
       }
      else
      {
        System.out.println(n3);
      }
	}
}