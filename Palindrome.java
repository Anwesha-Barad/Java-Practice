//Palindrome checking of a number
import java.util.Scanner;
class Palindrome{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n= sc.nextInt();

        int rev=0;
        int original=n;
        for(int temp=n;temp>0;temp=temp/10){
            int digit=temp%10;
             rev=rev*10+digit;
        }
        if(rev == original){
            System.out.println(n+" is a Palindrome number");
        }
        else{
            System.out.println(n+"  is not a Palindrome");
        }
    }
}