package DSA;

public class mutable {
    public static void main(String args []){
        //If we want mutable output then we will use StringBuffer
        StringBuffer str=new StringBuffer("abc");
        str.setCharAt(0, 'd');
        System.out.println(str); //Here we will get a mutable output
        str.append("def");
        System.out.println(str+" "+ str.length());
       

    }
}
