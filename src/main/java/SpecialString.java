import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecialString {

    public static void main(String[] args) {

        String s = "aadaa";
        int n = s.length();
        List<String> list = new ArrayList<>();
        int i = 0, j = i + 1;
        int count1 = s.length();
        int j_counter = 0;
        int mid=s.length()/2;


        if (s.charAt(i) == s.charAt(j) && s.charAt(j)==s.charAt(s.length()-1) && s.charAt(j)==s.charAt(mid)) {

            count1 = n * (n + 1) / 2;

        }
        else {
            while (i < s.length() - 1 && j < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    list.add(s.substring(i, j + 1));
                    count1++;
                    j++;


                } else {
                    j++;
                    j_counter++;
                    if (j_counter > 2) {
                        i++;
                        j = i + 1;
                        j_counter = 0;

                    }
                }

            }
        }
        System.out.println(list);
        System.out.println(count1);
    }
}
