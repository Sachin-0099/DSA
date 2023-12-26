package DSA;

import java.util.Scanner;

public class reverseString1 {


    public static String reverseString1(String str){
      String   reversedString="";
      for(int i=0;i<str.length();i++){
        reversedString=str.charAt(i)+reversedString;
      }
      return reversedString;
    }
   public static void main(String args []){
    Scanner sc= new Scanner(System.in);
    System.err.println("Enter the string");
    String str=sc.nextLine();
 System.out.println(reverseString1(str));
   } 
}

