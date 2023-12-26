package DSA;

public class CompareTo {
    public static void main(String args []){
        String a="AMAN";
        String b="Bhuvan";
        System.out.println(a.compareTo(b));//Result will be negative because it calculaltes the result lexographically
        System.out.println(b.compareTo(a));//Result is poistive because it is calculatting the result lexographically.
        /* If s1>s2,the it will result in positive number.
         * If s1<s2.then it will result in negative number.
         * If s1==s2,it returns 0;
         */
    }
}
