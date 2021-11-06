import java.util.Scanner;

// import java.util.Scanner;

public class ArraysAll{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        int[] ar2 = {10,20,30,40,50};
        for (int i = 0 ; i < 10 ; i++) {
            int s = scan.nextInt();
            arr[i] = s;
            
        }
        for (int i : ar2) {
            System.out.print(i+" ");
            
        }
        scan.close();

    }
}