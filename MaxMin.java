public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {12,78,36,15,64,95,456,3,321,356,645,74,85};
        Max(arr);
        Min(arr);
    }
    static void Max(int[] x){
        int max = 0;
        for (int i : x) {
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }
    static void Min(int[] x){
        int min = x[0];
        for (int i : x) {
            if (i<min) {
                min=i;
            }
        }
        System.out.println(min);
    }
    }

