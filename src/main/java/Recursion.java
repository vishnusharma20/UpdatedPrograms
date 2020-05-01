public class Recursion {

    static boolean palindrome(String str)
    {
        if(str.length()==0 || str.length()==1){
            return true;
        }

        if(str.charAt(0)== str.charAt(str.length()-1)){
            return palindrome(str.substring(1,str.length()-1)) ;
        }
        else{

            return false;
        }
    }

    public static void main(String[] args) {

        if(palindrome("abbcbba")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }


}
