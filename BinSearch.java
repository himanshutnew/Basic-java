public class BinSearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,5,5,6,7,8,9,10};
        int[] arr2 = {10,9,8,7,6,5,5,5,4,3,2,1};
        int[] arr3 = {5,5,5,5,5,5,5,5,5,5,5};
        System.out.println(BiSearch(arr1,5));
    }
    public static int BiSearch(int[] ar,int x){
        int start = 0,end = ar.length-1,mid;
        if(ar[start]==ar[end]){
            return 0;
        }
        if(ar[start]<=ar[end]){
            while (start<=end) {  
                mid = (start+end)/2;
                if (ar[mid]>x){
                    end = mid-1;
                }else if(ar[mid]<x){
                    start=mid+1;
                }else if(ar[mid]==x){
                    return mid;
                }

            }
        }
        if(ar[start]>=ar[end]){
            while (start<=end) {  
                mid = (start+end)/2;
                if (ar[mid]<x){
                    end = mid-1;
                }else if(ar[mid]>x){
                    start=mid+1;
                }else if(ar[mid]==x){
                    return mid;
                }

            }
        }

        return -1;
    }
    
}
