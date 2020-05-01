import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Read {

    public static List<String> extractUrls(FileReader file1) throws IOException {

        BufferedReader bf = new BufferedReader(file1);
        List<String> containedUrls = new ArrayList<String>();

            String word;

        // Below code is used to find the URL part from the text
        //ANd it will return the list of URLs
        while ((word = bf.readLine()) != null) {

            String urlRegex = "((https?|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
            Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
            Matcher urlMatcher = pattern.matcher(word);

            while (urlMatcher.find()) {
                containedUrls.add(word.substring(urlMatcher.start(0),
                        urlMatcher.end(0)));
            }
        }
        return containedUrls;
    }

    public static void main(String[] args) throws IOException {

     //Here we are giving input as file location wilh file name
     List<String> extractedUrls = extractUrls(new FileReader("//Users/vishnusharma/IdeaProjects/untitled/src/main/java/File"));
     Map<String, Integer> map = new HashMap<>();
     List<String> mostVisitedUrls= new ArrayList<>();
     int count=0;


     //Below code is used to find the frequency of each URL and storing them into a map

        for (String url : extractedUrls)
        {
            URL link = new URL(url);
            String host=link.getHost();

            if (map.containsKey(host) ) {
                count = map.get(host);
                map.put(host, count + 1);
                count++;
            } else {
                map.put(host, 1);
            }

        }

        //Below code is used to Sort the URL according to most visited
        // Here we used comaparator interface to sort the values in a map

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // Here we are adding the sorted URL to the list
        for (Map.Entry<String, Integer> entry : list) {
            mostVisitedUrls.add(entry.getKey());
        }

        System.out.println(mostVisitedUrls);


    }
}
