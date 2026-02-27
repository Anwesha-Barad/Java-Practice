//user input reverse of a number using loop 
import java.util.Scanner;
class Reverse_number{
    public static void main(String s[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        int rev=0;
        for(int temp=n;temp>0;temp=temp/10){
            int digit=temp%10;
            rev = (rev * 10)+ digit;
           
        }
         System.out.println("reverse of the number "+n+" is "+rev);
    }
}