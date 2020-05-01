public class BeautifulNUmbers {

    public static void main(String[] args) {

        String s= "121";

        long b=0;
        for(int i=1;i<s.length();i++){

            long a=Long.parseLong(s.substring(0,i));

            String first="";
            first+=a;
             b=a;

            for(int j=0;j<s.length();j++){
                a++;
                first+=a;
            }
            String d = first.substring(0,s.length());

            if(d.equals(s.substring(0,s.length()))){
                System.out.println("YES" +" "+b);
                break;

            }
            if(i==s.length()/2){
                System.out.println("NO");
            }

        }

    }
}
