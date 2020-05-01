import java.util.*;

import static java.lang.StrictMath.abs;

/*
public class HackerRank {

    */
/*public String diagonalDifference() {

        int x=1,y=2,z=3;

        if(x<z && y<z && x<y)
        {
            return "Cat B";
        }
        else if (y<z && x<z && y<z){
            return "Cat A";
        }
        else if ((z-x)==(z-y))
        {
            return "Mouse C";
        }*//*


     */
/*   int[] keyboards = {4};
        int[] drives = {5};
        int b = 5;
        int count = 0;
        int[] sum = new int[keyboards.length * drives.length];
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {

                sum[count] = keyboards[i] + drives[j];
                count++;
            }
        }
        Arrays.sort(sum);

        int max = 0;
        int count1 = 0;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] > b) {
                count1++;
                if (count1 == sum.length) {
                  max=-1;
                }

            } else {
                max = sum[i];
               // System.out.println(max);
                break;
            }

        }
    return max;*//*



    public static void main(String[] args) {
*/
/*
            HackerRank h= new HackerRank();
            h.diagonalDifference();

        }*//*






       */
/* for(int i=1;i<5;i++){
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*//*

        */
/*int[] arr ={4,3,-1,0};
        Arrays.sort(arr);
        long sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println((sum-arr[0])+" "+(sum-arr[n-1]));
*//*


       */
/* int[] arr ={4,3,-1,0};
       double n=arr.length;

        double negative=0;
        double positive=0;
        double zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                negative++;
            }
            else if(arr[i]>0) {
                positive++;
            }
            else if(arr[i]==0)
                zero++;

        }
        System.out.printf("\n%1$.6f",negative/n);
        System.out.printf("\n%1$.6f",positive/n);
        System.out.printf("\n%1$.6f",zero/n);*//*


       */
/* int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                    System.out.println(count);

                }
            }
        }
        System.out.println(count);*//*

       */
/* int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);*//*

*/
/*
       List<Integer> a= new ArrayList<Integer>();
       a.add(2);
       a.add(4);
       a.add(6);
        List<Integer> b= new ArrayList<Integer>();
        b.add(3);
        b.add(1);
        b.add(3);

        List<Integer> c= new ArrayList<Integer>();
        int count1=0;
        int count2=0;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(a.get(i)>b.get(j) && i==j){
                    count1++;
                }

                else  if(a.get(i)<b.get(j) && i==j){
                    count2++;

                }


            }

        }
        c.add(count1);
        c.add(count2);
        System.out.println(c);
    }*//*

       */
/* int[] arr= new int[10];
        int[] arr2= new  int[10];

        int[] apples= {-2,2,1};
        int[] oranges={5,-6};

        int a=5,b=15;
        int s=7,t=11;
        int count_apples=0;
        int count_oranges=0;
       // int[] temp1= new int[apples.length];

        for(int i=0;i<apples.length;i++)
        {
            arr[i]=a+apples[i];
            if(arr[i]>=s && arr[i]<=t){
                count_apples++;
            }

        }
        System.out.println(count_apples);
        for(int j=0;j<oranges.length;j++)
        {
            arr2[j]=b+oranges[j];
            if(arr2[j]>=s && arr2[j]<=t){
                count_oranges++;
            }

        }
        System.out.println(count_oranges);*//*


    */
/*    List<Integer> a= new ArrayList<Integer>();
        List<Integer> b= new ArrayList<Integer>();
        a.add(71);
        a.add(67);
        a.add(39);
        a.add(33);

        for(int i=0;i<a.size();i++) {
            int curr=a.get(i);
            int next=curr+(5-(curr%5));
            if (next-curr<3 && curr>37){
                curr=next;
                b.add(curr);
            }
            if (next-curr>3 && curr>37){
                curr=curr;
                b.add(curr);
            }
            if(next-curr==3 && curr>37){
                curr=curr;
                b.add(curr);
            }
            if(curr<38){
                curr=curr;
                b.add(curr);
            }
        }
        System.out.println(b);*//*


       */
/* int x1=21,v1=6,x2=47,v2=3;
        int temp=x1+v1,temp2=x2+v2;

        if(x2>x1 && v2>v1)
        {
            System.out.println("NO");
        }
        else {
            for (int i = 0; i < 10000; i++) {
                temp += v1;
                temp2 += v2;
                if (temp == temp2) {
                    System.out.println("yes");
                    System.exit(0);
                }
            }
            System.out.println("NO");
        }*//*



        //   if( v1>v2 && x1<x2) {
       */
/* while (temp != temp2) {
            temp += v1;
            temp2 += v2;
        }
        if(temp==temp2){
            System.out.println("yes");
        }

        if(x2>x1 && v2>v1)
        {
            System.out.println("NO");
        }*//*


     */
/* int[] arr=  {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
      int count=0,count1=0,max=arr[0],min=arr[0];

      for(int i=0;i<arr.length-1;) {
          if (arr[i] > max) {
              arr[i]=max;
              count++;
          }
          if(arr[i]<min){
              min=arr[i];
              count1++;
          }
      }*//*


         */
/* for(int j=0;j<arr.length-1;){
          if(arr[j+1]<arr[j]){
              count1++;
              j++;

          }
      }*//*


       */
/*  int[] s={1,2,1,3,2};
       //  int[] sum= new int[arr.length];

        int count=0;
        int d=3,m=2;
        for (int i = 0; i <s.length-m+1; i++) {
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=s[i+j];

                if (sum==d && j==m-1) {
                    count++;
                }

            }
        }
        System.out.println(count);*//*


        //}


    }*/
