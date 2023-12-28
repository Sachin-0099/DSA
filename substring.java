package DSA;

public class substring {
    public static void main(String args []){
        String str="pqrs";
      
        
        for(int i=0;i<str.length();i++){
            for(int end=i;end<str.length();end++){
                System.out.println(str.substring(i,end+1)+" ");
            }


            }
      
        }
    }
