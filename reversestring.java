package DSA;

import java.util.Scanner;

public class reversestring {
    public static String reverseString(String str){
      String   reversedString=" ";
      for(int i=str.length()-1;i>=0;i--){
        reversedString+=str.charAt(i);
      }
      return reversedString;


    }
   public static void main(String args []){
    Scanner sc= new Scanner(System.in);
    System.err.println("Enter the string");
    String str=sc.nextLine();
 System.out.println(reverseString(str));
   } 
}
