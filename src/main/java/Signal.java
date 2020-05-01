public class Signal {

    public static void main(String[] args) {

       String Expected="SOSSOSSOSSOS";
        String input =  "SOSSOSSOS";


        String e= "SOS";
        while(e.length()<input.length()){
             e = e.concat(e.substring(0,3));
        }
        System.out.println(e);

        int j=0;
        int i=0;
        int count=0;
        while(j<input.length()){
            if(e.charAt(i)==input.charAt(j)){
               i++;
               j++;
            }
            else{
                count++;
                i++;
                j++;
            }

        }
        System.out.println(count);


    }
}
