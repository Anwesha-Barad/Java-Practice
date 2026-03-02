//Palindrome checking of a string
import java.util.Scanner;
class Palindrome_string{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String:");
        String n= sc.nextLine();

        String rev="";
        String original=n;
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        if(rev.equals(original)){
           System.out.println(n+" is a Palindrome .");
        }
        else{
           System.out.println(n+" is not a  Palindrome .");
        }
    }
}