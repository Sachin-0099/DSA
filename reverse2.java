package DSA;

import java.util.Scanner;

public class reverse2 {
    public static String reverseword(String str){
String ans="";
int currentstartword=0;
int i;
for( i=0;i<str.length();i++){
    if(str.charAt(i)==' '){
//reverse current word
int currentEndWord=i-1;
String reverse="";
for(int j=currentstartword;j<=currentEndWord;j++){
    reverse=str.charAt(j)+reverse;
}
ans+=reverse+" ";
currentstartword=i+1;
    }
}
int currentEndWord=i-1;
String reverse="";
for(int j=currentstartword;j<=currentEndWord;j++){
    reverse=str.charAt(j)+reverse;
}
ans+=reverse;
return ans;

}
    
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String str=sc.nextLine();

String answer=reverseword(str);
System.out.println(answer);



    }
    }

