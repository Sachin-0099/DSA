package DSA;

import java.util.Scanner;

public class palindromebf {
    public static boolean palindrome(String str){
        String reversedString="";
        for(int i=0;i<str.length();i++){
           reversedString=str.charAt(i)+reversedString;
        }
        if(str.equals(reversedString)){
       return true;
        }else{

        
        return false;
        }
        
    }
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input string");
        String str=sc.nextLine();
       boolean ans= palindrome(str);
       System.out.println(ans);

    }
}
