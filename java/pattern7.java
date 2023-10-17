public class pattern7 {
      public static void main(String[] args) {
       int n=9;
       for(int i=0;i<n;i++)
       {
            if(i==((n/2)+1))
            for(int j=0;j<n;j++)
            {
                  System.out.print("+");
            }
            else
            {
             for(int j=0;j<n;j++)
             {
                  if(j==n/2)
                  {
                        System.out.print("+");
                  }
                  else
                        System.out.print(" ");
                  }
            }
                  System.out.println();
             }
            }
       }     
      
