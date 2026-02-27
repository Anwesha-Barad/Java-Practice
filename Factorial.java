//
import java.util.Scanner;

class Factorial{
    public static void main(String s[]){
     Scanner sc=new Scanner(System.in);
      System.out.print("enter number: ");
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++){
      fact=fact*i;
    }
      System.out.println("Factorial: "+fact);
    }
}