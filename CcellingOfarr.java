public class CcellingOfarr {
    public static void main(String[] args) {
        int[] arr = {1,5,6,6,8,9,20,26,29,30,35,39,45,52,59,66};
        int target = 0;
        System.out.println( celling(arr,target));
        // floor(arr,target);  
    }
    public static int celling(int[]x,int k){
        var st = 0;
        int end = x.length-1;
        int mid;
        if(k>=x[end]){
            return -1;
        }
        while (st<=end) {
            mid = (st+end)/2;
            if(x[mid]>k){
                end = mid-1;
                // hello from git
            
            }else if(x[mid]<k){
                st = mid+1;
            }else if (x[mid]==k){
                return x[mid+1];
            }
           
        }
        return x[st];
    }
}
