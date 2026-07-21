//count no of digit present
import java.util.Scanner;
class Count_digit{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no:");
        int n= sc.nextInt();
        int countno=0;
        while(n>0){
            n=n/10;
            countno++;
        }
        System.out.println(countno);
    }
}
