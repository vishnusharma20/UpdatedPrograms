import java.util.*;

class test
{

    public int shiftcount(int[] a, int[] b){

       int d=0;

       for(int i=0;i<a.length;i++) {
           if (!Arrays.equals(a, b)) {
               d++;
               swap(a);
               if(Arrays.equals(a,b))
                   break;
           }
       }
            return d;
    }

    public int[] swap(int[] a){

        for(int i=0;i<a.length-1;i++) {
            int temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp;

        }
        return a;
    }


    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int[] b={4,5,1,2,3};

        test t= new test();
        System.out.println( t.shiftcount(a,b));



    }
}





