import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class listing implements Sorter{


    @Override
    public listing Price() {

        JSONParser parser = new JSONParser();
        try {
            JSONObject o = (JSONObject) parser.parse(new FileReader("src/main/java/list.json"));
            JSONArray array = (JSONArray) o.get("price");
            ArrayList<JSONObject> list = new ArrayList<>();

            for (int i = 0; i < array.size(); i++) {
                list.add((JSONObject) array.get(i));
            }
            Collections.sort(list, new Builder.MyJSONComparator());

            for (JSONObject obj : list) {
                System.out.println((JSONObject) obj.get("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        return this;

    }

    @Override
    public listing Name() {
        System.out.println("Category filter applied");
        return this;
    }



}
