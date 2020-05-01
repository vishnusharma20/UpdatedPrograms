
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.util.*;

public class SortJSON {

public static void main(String[] args) throws ParseException {


        JSONParser parser = new JSONParser();
        try {
            JSONObject o = (JSONObject) parser.parse(new FileReader("src/main/java/list.json"));
            JSONArray array = (JSONArray) o.get("Sort");
            List<JSONObject> list = new ArrayList<>();

            for (int i = 0; i < array.size(); i++) {
                list.add((JSONObject) array.get(i));
            }
            Collections.sort(list, new NameSorter());
            System.out.println("List is sorted as per Name: "+list);

            Collections.sort(list, new PriceSorter());
            System.out.println("List is sorted as per Price: "+list);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

    class NameSorter implements Comparator<JSONObject> {

        @Override
        public int compare(JSONObject o1, JSONObject o2) {
            String v1 = (String) o1.get("name");
            String v2 = (String) o2.get("name");

            return v1.compareTo(v2);
        }
    }
        class PriceSorter implements Comparator<JSONObject> {

            @Override
            public int compare(JSONObject o1, JSONObject o2) {

                Long v3 = (Long) o1.get("price");
                Long v4 = (Long) o2.get("price");
                return v3.compareTo(v4);
            }
    }


