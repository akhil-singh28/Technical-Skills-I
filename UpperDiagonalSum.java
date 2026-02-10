// WAP TO SUM OF UPPER DIAGONAL ELEMENT OF A MATRIX

    import java.util.Scanner;
    public static void main(String[] args) {
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
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum is:"+sum);
    }
}

