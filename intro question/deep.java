public class deep {
    public static void main(String[] args) {
        Address a1 = new Address("New York");
        Student s1 = new Student("John", a1);

        Student s2 = new Student(s1);

        s2.address.city = "Chicago";

        System.out.println(s1.address.city); // New York
        System.out.println(s2.address.city); // Chicago
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Copy Constructor
    Address(Address a) {
        this.city = a.city;
    }
}

class Student {
    String name;
    Address address;

    // Deep Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.address = new Address(s.address);
    }

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}