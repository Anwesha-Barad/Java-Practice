//swapping without third veriable

import java.util.Scanner;
class Swapping{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int a= sc.nextInt();
        System.out.print("enter second number:");
        int b= sc.nextInt();

         System.out.println("before swapping:");
         System.out.println(a);
        System.out.println(+b);

          System.out.println("after swapping:");
          a=a+b;
          b=a-b;
          a=a-b;
        System.out.println("first number: "+a);
        System.out.println("second number: "+b);
    }
}