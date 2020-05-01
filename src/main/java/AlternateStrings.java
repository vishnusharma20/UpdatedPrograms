import java.util.ArrayList;
import java.util.List;

public class AlternateStrings {

    public static void main(String[] args) {


        String s="AAABBB";
        //output s= AB

        List<Character> list= new ArrayList<>();

        for(int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }

        int count=0;
        int i=0;
        for(int j=i+1;j< list.size();j++)
        {
          //  int i=0;
            if(list.get(i)==list.get(j)){
                list.remove(j);
                count++;
                j--;
            }
            else {
                i=j;
            }

        }

       // return count;



    }
}
