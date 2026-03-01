//a number is a prime number or not
import java.util.Scanner;
class Prime_no{
    public static void main (String[] s){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no:");
    int n=sc.nextInt();
    boolean prime=true;

    if(n<=1){
        prime= false;
    }
    for(int i=2;i<n;i++){
        if(n%i==0){
            prime=false;
        }
    }
    if(prime){
        System.out.println(n+"  is a prime number");
    }
    else{
        System.out.println(n+"  is not a prime number");
    }
  }
}