import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // ArrayList<Integer> arr = new ArrayList<>();
        // System.out.println("enter 0 to exit the loop or 10 to print the Array list : ");
        // int input = inp.nextInt();
        // while (true){            
        //     switch(input){
        //         case 0 :
        //         System.exit(0);
        //         break;
        //         case 10 :
        //         System.out.println(arr.toString());
        //         break;
        //         default:
        //         arr.add(input);
        //     }
        // } 
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        System.out.println("inter the row number that you want : ");
        int row = inp.nextInt();
        for(int i = 0; i<row ;i++){
            // initialisation
            ar.add(new ArrayList<>());
            System.out.print("how much element you need in the "+i+" row :-> ");
            int col = inp.nextInt();
            for (int j = 0;j<col;j++){
                ar.get(i).add(inp.nextInt());
                inp.close();
            }

        } 
        System.out.println(ar);
    }
    
}
