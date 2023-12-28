package DSA;

public class comparison_String {
    public static void main(String args []){
        String str="abc";
        String str1="abc";
        String str3=new String("abc");
        //String is a no-primitive datatype when we will compare them address will be compared
        //If we want to copare the content be must be cautious.
        /* Here str will equal to str1 becuase they are created inside string pool and they have same address */
        if(str==str1){
            System.out.println("Strings are equal");

        }else{
            System.out.println("Strings are not equal");
        }
        //Here string will not be equal because way of creating string is quite different here 
        /* str will be created in string pool whereas str3 will be created 
        inside heap that's why their address will be different that's why 
        they are not equal */
        if(str==str3){
             System.out.println("Strings are equal");

        }else{
            System.out.println("Strings are not equal");
        
        }

    }
}
