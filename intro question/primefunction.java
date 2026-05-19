public class primefunction {
  // using function overloading

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrime(long n) {
    if (n <= 1) {
      return false;
    }
    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    System.out.println(isPrime(12));
    System.out.println(isPrime(17L));
  }
}

