public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Rishi", "Reddy");
        p1.rishi();
        System.out.println(p1);

        System.out.println(p1.getFirstName());
        p1.setFirstName("");
        System.out.println(p1.getFirstName());
        
        /*
        Person p1 = new Person("Rishi", "Reddy");
        System.out.println(p1.getFirstName);
        p1.setFirstName("");
        System.out.println(p1.getFirstName());
        */
    }
}
