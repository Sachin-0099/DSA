package DSA;
import java.util.*;
public class palindrome {
    public static boolean palindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
if(str.charAt(left)!=str.charAt(right)){
    return false;
}
left++;
right--;

        }
        return true;
    }
    public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
boolean ans=palindrome(str);
System.out.println(ans);

    }
}
