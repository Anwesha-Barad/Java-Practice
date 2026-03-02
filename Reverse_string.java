//reverse of a string
import java.util.Scanner;

class Reverse_string{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String n= sc.nextLine();

        String rev="";
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        System.out.println("reverse of "+n+" is "+rev);
    }
}