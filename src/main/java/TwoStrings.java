import java.util.HashMap;
import java.util.Map;

public class TwoStrings {


    public static void main(String[] args) {

    /*    int[] arr = {2, 1, 20, 3, 4,5};

        int swapcount = 0;
        int a=0;


        for (int i = 0; i < arr.length -1; i++) {
            int comcount=0;
           for(int j=i+1;j<arr.length;j++){
            if (arr[i] > arr[j]  && comcount<3 ) {
                swapcount++;
                comcount++;
                }
            }
            if (comcount >= 3) {
                System.out.println("Too Chaotic");
                a=comcount;
                break;
        }
    }
        if(a<3)
        System.out.println(swapcount);*/

        int[] arr=  {2,3,4,1,5};
        int[] arr1=  {7,1,3,2,4,5,6};
        int max=0;
        int min=0;


            //Integer[] differ= MinSwapArray.difference(arr);

            for(int i=0;i<arr.length-1;i++){

                if(arr[i]>arr[i+1]){
                    max=arr[i];

                }
                else{
                    min=arr[i];
                }
            }


            System.out.println(max);


        }
}