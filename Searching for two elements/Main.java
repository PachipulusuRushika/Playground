import java.util.Scanner;
class Main{
    public static void main(String args[]){
     
      int mat=0,cat=0,i;Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
        int a[] = new int[n];
       
        for( i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      int s1=s.nextInt();
      int s2=s.nextInt();
      
      for(i=0;i<n;i++)
        
      {
        if(a[i]==s1)
        {
         mat=i;
        }
    }
      for(i=0;i<n;i++)
      {
        if(a[i]==s2)
        {
          cat=i;
        }
    }
      if(mat!=0)
      {
         System.out.println(mat);
        }
        else
        {
           System.out.println("-1");
        }
      if(cat!=0)
      {
         System.out.println(cat);
        }
        else
        {
           System.out.println("-1");
        }
        
}
}