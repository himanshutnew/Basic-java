public class SwapArrEle {
    public static void main(String[] args) {
    int[] arr = {12,78,36,15,64,95,456,321,356,645,74,85};
    Swapi(arr,3,8);
        
    }
    static void Swapi(int[]ar ,int x,int y){
        int temp = ar[x];
        ar[x]=ar[y];
        ar[y]=temp;
        for (int i : ar) {
            System.out.print(i+ " ");
        }
    }
}
