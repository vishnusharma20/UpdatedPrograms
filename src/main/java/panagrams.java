import java.util.*;

public class panagrams {

    public String[] weight(String s){

        String s1=s.toLowerCase();
        String alp="abcdefghijklmnopqrstuvwxyz";

        List<String> list= new ArrayList<>();
        String[] strarray= new String[s.length()];

        Set<Integer> numList = new HashSet<Integer>();


        int i=0,j=0;
        while( i<s1.length() && j<s.length()){
            {
                if (s1.charAt(i) == s1.charAt(j)) {
                    list.add(s1.substring(i, j + 1));
                    j++;
                } else {
                    i=j;


                }
            }
        }

        System.out.println(list);

        Map<String, Integer> map= new HashMap<>();

        Integer[] arr1= new Integer[s.length()];
        Integer[] arr2= {6,1,3,12,15,9,10};

        int m=0;
        int count=0;
        while(m<alp.length()){
            map.put(Character.toString(alp.charAt(m)),count+1);
            m++;
            count++;
        }

        String str=null;
        for(int k=0;k<list.size();k++){
            if(list.get(k).length()==1){
                numList.add(map.get(list.get(k)));
            }
            else{
                str=list.get(k);
                numList.add(map.get(Character.toString(str.charAt(0)))*str.length());
            }
        }

        System.out.println(numList);


        for(int l=0;l<arr2.length;l++){
           // int x = in.nextInt();
            if(numList.contains(arr2[l])){
                strarray[l]= "YES";
            }
            else{
                strarray[l]= "No";
            }
        }


       /* for(int l=0;l<arr2.length;l++){
            int count1=0;
            for(int n=0;n<arr1.length;n++){
                if(arr2[l]==arr1[n]){
                    // System.out.println("YES");
                    strarray[l]= "YES";
                }
                else
                {
                    count1++;
                    if(count1==arr1.length){
                        //   System.out.println("NO");
                        strarray[l]= "No";
                    }}
            }

        }
*/
        return strarray;
    }





    public static void main(String[] args) {


        //String s= "WwmdRukNYPMFBxYFPVtZrzs FAktokrLtdPyVRWCyqSHaqjttuhYNXpwnzwoXDC AdKRP AWwEamzQlOT EweNHXGkYrgJJwzErXvkiYIGOK goZXDYecGz oPHaxcZZC Z ktcXTnPFeuPQgQqoJS LZtk nOA zXc QyDseEIHVueKlgZVcQhgc hNHCQJS NXqvz EIOrqfPcBaXHDmWCHKMufyLXBQPVROdnlWDICRO qUNaVNP I fJAoEK saAnGbE pXvQW nd bitUAdJoIkbhPkwiKVUxpgV NsDCpwztiCXliMHrOEicnEsVc uIiai hLRqwFVeeHQzXXqVgUmNcqc TdHCztGUXwnzFGIPdYNZhfFKPQuUI ynSWARRzzwlRlzL JxsljNx YGfagQnP g VMImbbBNiOjNqtFb ODtQK DxNIfqggIzXgP eGMS kcnelJ kOTAG tSwcSlyMp xVjLZigPdsR yilXJyDa SKGOj yWEROeKfnPE iSFZwHPj ZPwKdllGxEdtpKwTMcB Yuus JgyWdYHj snl HrFqRgVDgVPAh X PBRAkR EwpdMYrlgI QKUnRBfKLwV yXKKGbMkIRIYN dqzaYvIQM vt yvuaGntYHEgEJb TNoPvslu htYlZXayqTlcNclvSOoMyfiTWehzhs W wanyMaAYijgxubvDINMlqHblbjLSJCvCpfvqaWHy qwG lLciwkkuu o NoSTWbytadyGuTRznISvCQhFMtrdqveTmcc mcKNPGowUGBLPmONplkUwZeu N p apQLbHLFSIt vkOcFlSMYZdaZy PzfbRPLTHy gAFo PLRItTAOfuWITfyIzUBc F GEXzyMZHXRpnpxQ NV Cl PIBRgkNNKQTVgGkTNbojQqm VvomeAxXDppIWm I KqyX CTA nt JTSsOH M mKzfGwsT LjXPVYzcJFdVWqkFRNm";

          // String str=  s.replace(" ","");
    //    System.out.println(str);

/*

        Set<Character> set= new HashSet<>();

        for(int i=0;i<str.length();i++){
            set.add(Character.toLowerCase(str.charAt(i)));
         //   System.out.println(set);
        }
        System.out.println(set);

        if(set.size()==26 ){
            System.out.println("panagram");
        }
        else
            System.out.println("not pangram");
*/

        panagrams p =  new panagrams();


        String[] result =  p.weight("abccddde");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);


        }



    }
}
