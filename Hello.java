import java.util.Scanner;

public class Hello{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name  ");
        String name =  input.next();
        System.out.println("hello mr "+name);
        System.out.println("enter 2 numers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        int sum = num1 + num2;
        System.out.println("The sum of "+ num1 +" and " + num2 +" is : "+ sum);

        
            
        }

    }
