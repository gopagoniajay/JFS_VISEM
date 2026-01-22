class PassPort {
    int passportNo;
    String nationality;

    PassPort(int passportNo, String nationality) {
        this.passportNo = passportNo;
        this.nationality = nationality;
    }
}

class Person {
    int id;
    String name;
    PassPort pass;

    Person(int id, String name, PassPort pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
}

public class OnetoOneDemo {
    public static void main(String[] args) {

        PassPort p = new PassPort(987654, "Indian");
        Person m = new Person(1, "Ajay", p);

        System.out.println("Person ID: " + m.id);
        System.out.println("Person Name: " + m.name);
        System.out.println("Passport Number: " + m.pass.passportNo);
        System.out.println("Nationality: " + m.pass.nationality);
    }
}
