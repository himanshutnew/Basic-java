public class WordWrap {
    public static void main(String[] args) {
        char[] ch = {'a','f','k','p','u','w'};
        char k = 'a';
        System.out.println(WrapCelling(ch,k));;
    }
    public static char WrapCelling(char[] ar,char x) {
        int st =0,end = ar.length-1,mid;
        while(st<=end){
            mid = st + (end-st)/2;
            if (ar[mid]<x){
                st = mid + 1;

            }else if(ar[mid]>x){
                end = mid -1;

            }else if(ar[mid]==x){
                if(mid==ar.length-1){
                    return ar[0];
                }else{
                    return ar[mid +1];
                }
            }
        }

        return ar[st];
    }
    
}
