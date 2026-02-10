
// WAP TO FIND SUM OF EVERY COLUMN OF A MATRIX 

import java.util.Scanner;
public class tenFeb{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        int r=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("Enter ele:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                sum=sum+arr[j][i];
            }
        }
        System.out.println("Sum is:"+sum);
    }
}
