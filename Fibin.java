import java.util.Scanner;

public class Fibin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("enter the num for fibinachi series : ");
        int n = in.nextInt();
        in.close();
        while (n>=count){
            int temp = b;
            b = b+a;
            a=temp;
            count++;
        System.out.println(b);

        }
        System.out.println(b);
    }
    
}
