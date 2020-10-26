public class Person {
    //instance variables
    private String firstName;
    private String lastName;

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

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setFirstName(String firstName) {
        if (firstName.trim().length() != 0) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.trim().length() != 0) {
            this.lastName = lastName;
        }
    }
}













