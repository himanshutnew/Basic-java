import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
        in.close();  
    }
} 



// import java.util.*;
// import java.io.*;

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         int[][] arr = new int[t][];
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             int sum = 0;
//             for(int j=0;j<n;j++){
//                 arr[i] = new int[n];
//                 sum = sum + (a+2^j)*b;
//                 System.out.println(sum);
//                 arr[i][j] = sum;              
//             }
//         }
//         // System.out.println(arr);



//         in.close();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++)
//                 System.out.printf(arr[i][j] + " ");
//             System.out.println();
//     }
        
//     }}

