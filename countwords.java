package DSA;

import java.util.Scanner;

public class countwords {
    public static int wordscount(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }

        return count;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
 System.out.println(wordscount(str));
    }
}
