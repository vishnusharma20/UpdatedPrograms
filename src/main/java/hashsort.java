import java.util.*;

public class hashsort {

    public static void main(String[] args) {
        HashMap<String, String> tm = new HashMap<>();
        tm.put("a", "aaaaa");
        tm.put("b", "baaaaa");
        tm.put("d", "daaaaa");
        tm.put("e", "eeeeee");
        tm.put("aa", "jejejejej");
        tm.put("c", "caaaaa");


        ArrayList<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(tm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        for(Map.Entry<String, String> entry:list){

            System.out.println(entry.getKey()+"=="+entry.getValue());

        }

    }


}