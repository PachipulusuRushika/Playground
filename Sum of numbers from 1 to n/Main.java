import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int sum=0;
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int count=1;count<=n;count++)
      {
        sum=sum+count;
      }
      System.out.println(sum);
	}
}