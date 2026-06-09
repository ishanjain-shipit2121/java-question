public class reverselinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        // Push operation
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        // Pop operation
        int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        // Display stack
        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Reverse the stack
        void reverse() {
            Node prev = null;
            Node current = top;
            Node next;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            top = prev;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original Stack:");
        stack.display();

        stack.reverse();

        System.out.println("Reversed Stack:");
        stack.display();
    }
}