import java.util.Scanner;
public class decimaltobinary {
  public static void dectoBin( int n) {
  int pow = 0;
  int binNum = 0;
 int myNUM = n;
  while(n > 0) {
    int rem = n % 2;
    binNum = binNum + (rem * (int)Math.pow(10, pow));
pow++;
n = n/2;
  }
  System.out.println("binary form of " +  myNUM + " = "+ binNum);

}

public static void main(String args[]) {
dectoBin(10);
}
}  


