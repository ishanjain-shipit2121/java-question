public class Powerof2 {
  public static boolean Powerof2(int n) {
    return(n&(n-1)) == 0;

  }

  public static void main(String args[]) {
    System.out.println(Powerof2(12));
  }
}



