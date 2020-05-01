import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    int a=9; int b=9;

    private int add(){

        return a+b;
    }
    int result(){

        return new Main().add();
    }
}
class Examp3{

    public static void main(String []aa) {

        String str="9398155684";
        char[] arr= str.toCharArray();
        LinkedHashMap<Character,String> map = new LinkedHashMap<Character,String>();

        for(char a:arr){
            if(a=='1'){
                map.put(a,"a");
            }
            else if(a=='2'){
                map.put(a,"b");
            }
            else if(a=='3'){
                map.put(a,"c");
            }
            else if(a=='4'){
                map.put(a,"d");
            }
            else if(a=='5'){
                map.put(a,"e");
            }
            else if(a=='6'){
                map.put(a,"f");
            }
            else if(a=='7'){
                map.put(a,"g");
            }
            else if(a=='8'){
                map.put(a,"h");
            }
            else if(a=='9'){
                map.put(a,"i");
            }
        }

        for (Map.Entry<Character,String > m: map.entrySet()){

            System.out.print(m.getValue());
        }

    }
}
