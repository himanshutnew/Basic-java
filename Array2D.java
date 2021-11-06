import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        Scanner scan = new Scanner(System.in);
        for (int row = 0;row < 5;row++){
            for(int col = 0 ; col < 5 ;col++){
                int x = scan.nextInt();
                arr[row][col] = x;

            }
        } 
        for (int row = 0;row < 5;row++){
            for(int col = 0 ; col < 5 ;col++){
                int x = arr[row][col];
                System.out.print(" "+x);
            }
            System.out.println();
        }
        scan.close();

    }
    
}
