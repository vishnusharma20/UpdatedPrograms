import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;



public class BrowserHistory {

    public static void main(String[] args) throws IOException {

        //Read a text file
        FileReader file1 = new FileReader("//Users/vishnusharma/IdeaProjects/untitled/src/main/java/File");
        BufferedReader bf = new BufferedReader(file1);

        String word;

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        while ((word = bf.readLine()) != null ) {

            if (map.containsKey(word) ) {
                count = map.get(word);
                map.put(word, count + 1);
                count++;
            } else {
                map.put(word, 1);
            }
        }


        Set<Map.Entry<String, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }


    }




    }
