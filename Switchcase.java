import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        System.out.println("please enter the num of a day in weak : ");
        Scanner q = new Scanner(System.in);
        int v = q.nextInt();
        q.close();
        week (v);}

        static void week(int x){
            switch(x){
                case 1:
                System.out.println("This is Monday");
                break;
                case 2:
                System.out.println("This is Tuesday");
                break;
                case 3:
                System.out.println("This is Wednesday");
                break;
                case 4:
                System.out.println("This is Thrusday");
                break;
                case 5:
                System.out.println("This is Friday");
                break;
                case 6:
                System.out.println("This is Saturday");
                break;
                case 7:
                System.out.println("This is Sunday");
                break;
                default:{
                    System.out.println("Please enter valid number ");

                }


            }
        }

    }
    

