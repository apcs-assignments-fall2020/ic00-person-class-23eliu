public class Person {
    //instance variables
    public String firstName;
    public String lastName;

    //constructor
    public Person(String a, String b) {
        firstName = a;
        lastName = b;
    }

    //method doSomething()
    public void rishi() {
        System.out.println("I am being obnoxious.");
    }

    //useful toString()
    public String toString() {
        String str = firstName + " " + lastName;
        return str;
    }
}













