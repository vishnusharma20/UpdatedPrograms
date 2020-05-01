import java.util.*;

public class TwoCharacters {

    public static void main(String[] args) {

        String s = "abcb";
        //beabeefeab
        char[] arr = s.toCharArray();

        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        int len = 0;
        int count = 0;


         if(s.length() > 2) {
            /*for (char word : arr) {
                if (map.containsKey(word)) {
                    count = map.get(word);
                    map.put(word, count + 1);
                    count++;
                } else {
                    map.put(word, 1);
                }
            }

            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }

            Character a = null;
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() == 1) {
                    a = e.getKey();

                    list.removeIf(a::equals);
                }


            }*/
            //  System.out.println(list);


            for (int i = 1; i <= list.size() - 2; i++) {

                if (list.get(i - 1) == list.get(i)) {
                    Character str = list.get(i);
                    list.removeIf(str::equals);
                }
                System.out.println(list);
                if (list.get(i - 1) != list.get(i + 1)) {
                    Character str1 = list.get(i);
                    list.removeIf(str1::equals);
                }
                //     System.out.println(list);
            }

            for (int i = 0; i < list.size() - 2; i++) {
                int c = 0;
                if (list.get(i) == list.get(i + 2)) {
                    c = list.size();
                    len = c;

                } else {
                    c = 0;
                    len = c;
                }

            }
             //System.out.println(list);

        }

         else{
             len=s.length();
         }

        System.out.println(list);
        System.out.println(len);

    }
}
