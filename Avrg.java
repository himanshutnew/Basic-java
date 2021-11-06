import java.util.Scanner;

public class Avrg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total marks : ");
        float total = input.nextFloat();
        System.out.print("Enter obtain marks : ");
        float obtn = input.nextFloat();
        float avg = 100/total*obtn;
        String x = null;
        input.close();
        if (avg>60.0){
            x = "first div. pass"; 
        }else if((avg <=60.0 )&&(avg >40.0)){
            x = "second div. pass";
        }else if ((avg > 33.0)&&(avg <=40.0)){
            x = "third div. pass";
        }else {
            x = "failed";
        }
        System.out.println("your percentage is : " + avg);
        System.out.println("you are " + x);


    }
    
}
