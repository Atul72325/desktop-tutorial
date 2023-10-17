 import java.util.Scanner;
    public class even_odd{

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
          System.out.println("enetr number");
          int no=sc.nextInt();
          for(int i=0;i<+no;i++)
          {
              if(i%2==0){
                  System.out.println("no is even:"+i);
              }
              else{
                  System.out.println("no is odd");
              }
              
          }
        }
    }