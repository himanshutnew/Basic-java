import java.util.Arrays;

public class IndexStartEnd {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int k = 6;
        int[] h = IndexRange(arr,k);
        System.out.println(Arrays.toString(h));
    }
    public static int[] IndexRange(int[] x,int y) {
        int[] ans = {-1,-1};
        ans[0] = Search(x, y, true);
        if(ans[0]!= -1){
            ans[1]= Search(x, y, false);
        }

        return ans;
    }
    public static int Search(int[] a , int x,boolean isStart) {
        int ans = -1;
        int st = 0,end = a.length -1 ,mid;
        while(st<=end){
            mid = st + (end-st)/2;
            if(a[mid]>x){
                end = mid - 1;
            }else if(a[mid]<x){
                st = mid + 1;
            }else{
                // possible more target
                ans = mid;
                if(isStart){
                    end = mid-1;

                }else{
                    st = mid +1;
                }

            }

        }



        return ans;
    }
}
