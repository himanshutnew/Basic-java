import java.util.Scanner;

public class Arr2DAll {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] x;
        x=InpArr();
        OutArr(x);  
        System.out.println(LinSearch(x, 26));      
    }
    public static int LinSearch(int[][] a ,int x ){
        for (int[] is : a) {
            for (int is2 : is) {
                if(is2==x){
                    return 1;
                }
                
            }
            
        }
        return -1;
    }
    public static void OutArr(int[][] q){
        for (int[] is : q) {
            for (int is2 : is) {
                System.out.print(is2 + " ");                
            }
            System.out.println();            
        }
    }
    public static int[][] InpArr(){
        System.out.println("Please input the size of array Row and Colam : ");
        int x,y;
        x= inp.nextInt();
        y= inp.nextInt();
        int[][] ar = new int[x][y];
        for (int i=0;i<x;i++ ){
            for(int j = 0;j<y;j++){
                ar[i][j]=inp.nextInt();
            }
        }
        return ar;
    }
}
