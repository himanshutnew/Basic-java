public class FindAll {
    public static void main(String[] args) {
        int[] arr = {12,78,36,15,64,95,456,321,356,645,74,85};
        int fin=645;
        int x = Find(arr,fin);
        System.out.println(x);
        int y = Find(arr,fin,1,9);
        System.out.println(y);
    }
    static int Find(int[] ar,int k){
        for (int v= 0;v<ar.length;v++) {
            if (ar[v]==k) {
                return v;
            }
        }
        return -1;

    }
    static int Find(int[] ar ,int p,int start,int end){
        for (int i = start; i <= end; i++) {
            if(ar[i]==p){
                return i;
            }
        }
        return -1;
    }
}
