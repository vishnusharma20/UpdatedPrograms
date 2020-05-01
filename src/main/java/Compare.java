import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Compare {

    static String key = "key1";
    public static int checkTypeOfObject(Object obj)
    {
        if(obj instanceof JSONArray)
        {
            return 1;
        }
        if(obj instanceof JSONObject)
        {
            JSONObject jsonObject = (JSONObject) obj;
            return 2;
        }
        return 0;
    }

    public static void getKeyValue(Object obj) {
        while (true) {
            int type = checkTypeOfObject(obj);
            if ( type == 1) {
                JSONArray arrayList = (JSONArray) obj;

                for (Object o : arrayList) {
                    getKeyValue(o);
                }
                return;
            } else if (type == 2) {
                JSONObject jsonObject = (JSONObject) obj;

                if (jsonObject.containsKey(key)) {
                    System.out.println(jsonObject.get(key));
                    return;
                } else {
                    for (Object s : jsonObject.keySet()) {
                        Object objJsonMap = jsonObject.get(s);
                        getKeyValue(objJsonMap);
                    }
                    return;
                }
            }
            else
                return;
        }
    }


    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/main/java/file1.json"));
            getKeyValue(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
