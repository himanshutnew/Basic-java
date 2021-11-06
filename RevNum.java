import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number that you wanna reverse : ");
        long x = z.nextLong();
        z.close();
        long y = 0;
        while (x>0){
            y = (y*10)+(x%10);
            x/=10;

        }
        System.out.println("Reverse order :-> "+y);

    }
    
}
