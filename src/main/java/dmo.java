public class dmo {

    public static void main(String[] args) {


        int[] arr ={1,2,3,4,5};
        int[] arr1= new int[5];

        int count=0;
        arr1[count]=1;

        for(int i=0;i<arr.length;i++) {
            arr1[count]=(arr1[count]*arr[i]);
        }

        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr1[count]/arr[i];
            System.out.println(arr1[i]);
        }
        }
}
