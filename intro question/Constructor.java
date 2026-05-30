public class Constructor {
  public static void main(String args[]) {
 student s1 = new student("jainyy");
System.out.println(s1.name);
  }
}
class student{
   String name;
   int roll;



   student(String name) {
    this.name = name;


    // in java function there is no initilization
   }
}