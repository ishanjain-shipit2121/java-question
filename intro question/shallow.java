
  class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    String name;
    Address address;

    // Copy Constructor (Shallow Copy)
    Student(Student s) {
        this.name = s.name;
        this.address = s.address; // same object reference
    }

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class shallow {
    public static void main(String[] args) {
        Address a1 = new Address("New York");
        Student s1 = new Student("John", a1);

        Student s2 = new Student(s1);

        s2.address.city = "Chicago";

        System.out.println(s1.address.city); // Chicago
        System.out.println(s2.address.city); // Chicago
    }
}