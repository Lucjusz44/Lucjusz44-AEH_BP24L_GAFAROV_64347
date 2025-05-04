public class mySeventhApp {
    public static void main(String[] args) {
        // Create a new Person object
        Person p = new Person("John", 30, "Warsaw", 1995);

        // Show initial data
        System.out.println("Before aging:");
        p.showPersonData();

        // Grow older by 10 years
        p.growOld(10);

        // Be younger by 1 year
        p.beYounger();

        // Show updated data
        System.out.println("\nAfter modifications:");
        p.showPersonData();
    }
}

class Person {
    String name;
    int age;
    String address;
    int year_of_birth;

    // Constructor
    public Person(String name, int age, String address, int year_of_birth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    // Method to display person's data
    public void showPersonData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + year_of_birth);
    }

    // Method to increase age by given years
    public void growOld(int years) {
        this.age += years;
    }

    // Method to decrease age by 1
    public void beYounger() {
        this.age -= 1;
    }
}
