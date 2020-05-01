import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Builder {

    public static void main(String[] args) {




        listing l= new listing();
        l.Name();
        l.Price();


    }

    static class MyJSONComparator implements Comparator<JSONObject> {

        @Override
        public int compare(JSONObject o1, JSONObject o2) {
            String v1 = (String) o1.get("price");
            String v3 = (String) o2.get("price");
            return v1.compareTo(v3);
        }

    }






}
