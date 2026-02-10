// GIVEN AN ARRAY , COUNT NUMBER OF ELEMENTS HAVING ATLEAST ONE ELEMENT GREATER THAN ITSELF

// PSUEDO CODE-
// 1. iterate and find the max element from the array.
// 2. Iterate and get the number of element that are not equal to max
// 3. Increment the count.

import java.util.Scanner;

public class lect_20_Jan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;
            i++){
            if(arr[i]<max){
                count++;
            }
        }
        System.out.println(count);
    }
}

// Observation: for every max element there won't be any element greater than itself.


