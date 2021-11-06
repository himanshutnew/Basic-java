import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a number value : ");
        long x = scan.nextLong();
        System.out.print("please enter number that you wanna count : ");
        int z = scan.nextInt();
        scan.close();
        int count = 0;
        while (x>0){
            if (x % 10 == z){
                count++;
            }
            x/=10;
            System.out.println(x);

        }
        System.out.println("The number "+z+" occuring "+count+" times ");

    }
    
}
