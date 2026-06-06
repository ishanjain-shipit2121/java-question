import java.util.LinkedList;

public class ll {
  public static void main(String args[]) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    ll.add(2, 3);

    System.out.println(ll);

    ll.removeFirst();
    System.out.println(ll);
  }
}