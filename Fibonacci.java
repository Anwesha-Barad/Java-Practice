

import java.util.Scanner;
class Fibonacci_series{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter term:");
        int n= sc.nextInt();
        
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
       
    }
}