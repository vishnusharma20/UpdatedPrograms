import java.util.*;

public class NewPrograms {

   /* public int sortedURL(ArrayList<Integer> all) {
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        //String[] s1= new String[10];
        for(int s: all ) {
            int count=0;
            if(hm.containsKey(s)) {
                hm.put(s, hm.get(s)+1);
            }
            else {
                hm.put(s, 1);
            }
        }
        ArrayList<Integer> l= new ArrayList<Integer>();

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list , new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<Integer, Integer> entry:list){

            l.add(entry.getKey());
        }
        return l.get(0);
    }*/

    public static void main(String[] args) {


        int[] arr={2, 3, 4, 1, 5};



        int swaps=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=i+1 ){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swaps+=1;
            }
            System.out.println(swaps);
        }

        /*String s="beabeefeab";

        ArrayList<Character> l= new ArrayList<Character>();

        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }

        Set<Character> set= new HashSet<Character>(l);

        for(Character i:set){
            System.out.println(i+": "+ Collections.frequency(l,i));
        }*/

      /*  String s="middle-Outz";
        String str="abcdefghijklmnopqrstuvwxyz";
        String ans="cdefghijklmnopqrstuvwxyzab";

        s.toLowerCase();
        System.out.println(s);
        char[] encode=s.toCharArray();
        char[] str_arr=str.toCharArray();
        char[] ans_arr=ans.toCharArray();


      //  String ans = str.substring(2) + str.substring(0, 2); // cdefghijklmnopqrstuvwxyzab
     //   System.out.println(ans);
        LinkedHashMap<Character, Character> map1=new LinkedHashMap<>();
        Map<Character,Character> map2= new HashMap<>();

        for(int i=0;i<str_arr.length;i++){
            for(int j=i;j<ans_arr.length;j++){
                map1.put(str_arr[i],ans_arr[j]);
                break;
            }

        }

        for(int k=0;k<encode.length;k++){
            if(map1.containsKey(encode[k])){
                System.out.print(map1.get(encode[k]));
            }
        }


*/




       /* String[] strings={"def","de","fgh"};
        String[] queries={"de","lmn", "fgh"};


        int[] arr= new int[queries.length];
        LinkedHashMap<String,Integer> map= new LinkedHashMap<String,Integer>();

        for(String a:strings){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }

        int count=0;
        for(String b:queries){
            if(map.containsKey(b)){
                arr[count]=map.get(b);
                count++;
            }
            else{
                arr[count]=0;
                count++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

     /*  String password="#HackerRank";
        int size=0;

        char[] arr=password.toCharArray();
        if(password.length()<6)
        {
            size=6-password.length();
        }
        else if (password.length()>6)
        {
            int alpha=0,digit=0,special=0;
            for(int a:arr)
            {
            if(password.matches(".*[a-z].*")){
                alpha++;
            }

            else if(Character.isDigit(a)){
                digit++;
                //  System.out.println("letter/Digit");
            }
            else{
                //System.out.println("special");
                special++;
            }
        }
            if(special<1){size=special+1;}
            else if(alpha<1){size=alpha+1;}
            else{size=digit+1;}

        }*/
        //return size;


     //  s.split()

       /* ArrayList<Integer> al= new ArrayList<Integer>();
        ArrayList<Integer> l= new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);


    NewPrograms n= new NewPrograms();
        System.out.println(n.sortedURL(al));*/

       /*int[][] arr= new int[4][4];

       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               arr[i][j]=1;
           }
           System.out.println(arr);
       }

    }*/
    }
}
