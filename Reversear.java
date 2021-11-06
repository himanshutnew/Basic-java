
public class Reversear {
    public static void main(String[] args) {
    int[] arr = {12,78,36,15,64,95,456,321,356,645,74,85};
    RevArray(arr);

    }
    static void RevArray(int [] x){
        int start=0,end=x.length-1,temp;
        while (start < end) {
            temp = x[start];
            x[start]=x[end];
            x[end]=temp;
            start++;
            end--;
        }
        
        for (int i : x) {
            System.out.print(i+" ");
        }
    }
}
