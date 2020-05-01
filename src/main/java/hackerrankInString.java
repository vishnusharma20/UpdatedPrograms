import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hackerrankInString {

    public String hack(String s){

        String s1= "hackerrank";
        // String s ="hereiamstackerrank";

        char[] arr= s1.toCharArray();
        char[] arr1=s.toCharArray();

        LinkedHashMap<Character,Integer> map1= new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();


        for(char a:arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }

        for(char a:arr1){
            if(map1.containsKey(a)){
                map1.put(a,map1.get(a)+1);
            }
            else{
                map1.put(a,1);
            }
        }
        System.out.println("e: "  +map);
        System.out.println("e1: "+map1);

        String flag= null;

        for(Map.Entry<Character,Integer> e1: map1.entrySet()){
            for(Map.Entry<Character,Integer> e: map.entrySet()){
                if(e1.getValue()<e.getValue() && e1.getKey()==e.getKey())
                {
                    flag="NO";
                }

            }

        }

        if(flag==null)
            flag="YES";

        return flag;


    }

    public static void main(String[] args) {

        hackerrankInString h= new hackerrankInString();
        System.out.println( h.hack("hacerrank"));



        }
     }

