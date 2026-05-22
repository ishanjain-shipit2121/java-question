public class invertedhalfpyramid {
  public static void inverted_rotated_halfpyramid(int n) {
    //outer 
    for(int i=1; i<=n; i++) {
    // spaces 
  for(int j=1; j<=1; j++) {
      System.out.print(" ");
    }
      //STARS 
for(int j=1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    }
public static void main(String args[]) {
inverted_rotated_halfpyramid(4);
}
  
  }
