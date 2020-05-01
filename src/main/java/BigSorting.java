import java.util.*;

public class BigSorting {


    static String[] sort(String[] arr){

        String[] sorted= new String[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++)
            {
                    if(Long.parseLong(arr[i])>Long.parseLong(arr[j])){


                        Long temp = Long.parseLong(arr[i]);
                        arr[i] = arr[j];
                      // arr[j] = temp;

                    }
            }
        }

        for(int k=arr.length-1;k>=0;k--){
            sorted[k]=arr[k];
            System.out.println(sorted[k]);
        }

        return sorted;
    }
   /* {
        String[] sorted= new String[arr.length];
        try {


            List<Long> str = new ArrayList<>();


            for (int i = 0; i < arr.length; i++) {
                str.add(i, Long.decode(arr[i]));
            }

            Collections.sort(str, new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    return (Integer.valueOf(o1.compareTo(o2)));
                }
            });

            System.out.println(String.valueOf(str));


        }
        catch (Exception ex){
            System.out.println(ex.getCause());
        }
        return sorted;
    }*/


    public static void main(String[] args) {

        String[] arr ={"12303479849857341718340192371","1","3","10","2","3","92434343"};

      sort(arr);



    }
}
