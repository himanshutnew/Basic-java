import java.util.Scanner;

public class larger {
         
    public static void main(String[] args) {
        //this is comment
        System.out.println("enter three number : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if ((a>b)&&(a>c)){
            System.out.println(a +" is grater number"); 
        }else if((b>a)&&(b>c)){
            System.out.println(b+ " is grater number");
        }else{
            System.out.println(c+" is grater number ");
        } 

    }
}
