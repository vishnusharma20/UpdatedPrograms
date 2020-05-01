public class ValleyCount {

    public static void main(String[] args) {
        /*String s= "UDDDUDUU";
        int valley=0;
        int level=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='U'){
                ++level;
            }
            if(s.charAt(i)=='D'){
                --level;
            }

            if(level==0 && s.charAt(i)=='U'){
                ++valley;
            }

        }*/

      //  return valley;

        Integer[] arr1= {2,4,12,6,9,10,15};
        Integer[] arr2= {6,1,3,12,15,9,10};


        for(int a:arr1){
            int count=0;
            for(int b: arr2){
                if(a==b ){
                    System.out.println("YES");
                }
                else
                {
                    count++;
                    if(count==arr2.length){
                    System.out.println("NO");
                }}

            }
        }

    }


}
