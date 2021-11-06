public class Prime {
  public static void main(String[] args) {
      PrimeRange(55);

  }
  static void PrimeRange(int n){
      for (int i = 1; i <= n; i++) {
          if(isPrime(i)){
              System.out.println(i);
          }
      }
  }





  static boolean isPrime(int x){
      if(x<2){return false;}
    for (int i = 2; i <= Math.sqrt(x); i++) {
        if (x%i==0){
            return false;
        }

        
    }
    return true;

  }
    
}
