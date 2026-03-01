//Armstrong Number

import java.util.Scanner;
class Armstrong{
    public static void main(String s[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        int sum=0;
        int original=n;
        while(n!=0){
          int digit=n%10;
          sum= sum + (digit*digit*digit);
          n=n/10;
        }
        if(sum==original){
            System.out.println(original+" is a Armstrong number");
        }
        else{
            System.out.println(original+" is  not a Armstrong number");
        }
       
    }
}