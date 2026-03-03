//largest number
import java.util.Scanner;
class Largest_number{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int a= sc.nextInt();
         System.out.print("enter second number:");
        int b= sc.nextInt();
         System.out.print("enter third number:");
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest");
        }
        else if(c>a && c>b){
            System.out.println(c+" is largest");
        }
    }
}