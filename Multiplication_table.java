//user input multiplication table
import java.util.Scanner;
class Multiplication_table{
    public static void main(String s[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i +" ="+(i*n));
        }
    }
}