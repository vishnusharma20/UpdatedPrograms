import java.util.*;

public class ValidString {

    public static void main(String[] args) {

        String s = "abc";
       char[] arr= s.toCharArray();

       Map<Character,Integer> map= new HashMap<Character,Integer>();

        List<Integer> list = new ArrayList<>();

       for(char a: arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }

       for(Map.Entry<Character,Integer> e: map.entrySet()){
                     list.add(e.getValue());
       }

        System.out.println(list);

       for(int i=0;i<list.size()-1;i++){

           if (list.get(i)!=list.get(i+1)) {
              int j=list.get(i+1)-1;
              list.remove(list.get(i+1));
              if(j!=0){
              list.add(j);}
              break;
           }
       }

        System.out.println(list);


      /* for (Integer i : list) {
            if (!i.equals(list.get(0)))
              //  System.out.println("NO");
             //   return "NO";
        }*/
     //   return "YES";
    }
}
