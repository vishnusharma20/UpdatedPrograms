import java.util.ArrayList;
import java.util.List;

public class CommonChild {

    public static void main(String[] args) {


        String s1="ABCD";
        String s2= "ABDC";


        List<Character> list= new ArrayList<>();

        for(int i=0;i< s1.length()-1;i++){
            for(int j=0;i<s2.length()-1;j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    list.add(i, s1.charAt(i));
                    System.out.println("yes");

                } else {
                        return;
                }
            }
        }
        System.out.println(list);
    }
}
