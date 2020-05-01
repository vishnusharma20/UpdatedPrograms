import java.util.ArrayList;
import java.util.List;

public class CeaserCipher {

    public static void main(String[] args) {

        int d = 2;

       String orginal = "abcdefghijklmnopqrstuvwxyz";
        String s = "Middle-outz";
        String rotated = orginal.substring(d) + orginal.substring(0, d);
      List<Character> list = new ArrayList<>();

     /* char[] arr= s.toCharArray();
        char[] arr_rot=rotated.toCharArray();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr_rot.length;j++){
                if(Character.isUpperCase(arr[i])){
                    Character.toLowerCase(arr[i]);
                    if(arr[i]==arr)
                }
            }
        }
        */

        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < orginal.length(); j++) {
                if(Character.isUpperCase(s.charAt(i))){

                    if (Character.toLowerCase(s.charAt(i))== orginal.charAt(j)){
                        k = j;
                        list.add(i, rotated.charAt(k));
                    }
                   // list.add(i,s.charAt(i));
                   // i++;
                }
                else if(Character.isAlphabetic(s.charAt(i))){
                    if (s.charAt(i)== orginal.charAt(j)){
                        k = j;
                        list.add(i, rotated.charAt(k));
                    }
                    else{
                        list.add(i, rotated.charAt(k));
                        i++;
                    }

                }



            }

        }
        System.out.println(list);
    }



    }




