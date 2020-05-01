import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonParserDemo {


    public static <map> void main(String[] args) throws IOException, ParseException {

        FileReader reader = new FileReader("/Users/vishnusharma/IdeaProjects/untitled/src/main/java/Demo.json");
        JSONParser parser = new JSONParser();
        BufferedReader bf = new BufferedReader(reader);

        List<String> list= new ArrayList<>();


    //    JSONObject obj = (JSONObject) parser.parse(reader);
     //      JSONArray arr = (JSONArray) obj.get("cars.name");

        String word=null;
        int i=0;
        Map<String,Integer> map= new HashMap<String, Integer>();
        while ((word = bf.readLine()) != null) {



            map.put(word,i);
            i++;

        }
        System.out.println(map);

       /* List<Map<String,String>> lists = (List<Map<String, String>>) obj.values();
        for(int i=0;i<lists.size();i++){
            Map<String,String> map= new HashMap<>();

           for(int j=0;j<lists.size();j++){

               System.out.println(map.get("name"));
               map.get("name");


            }

            //System.out.println(lists.get(i));
        }*/
    }
}
