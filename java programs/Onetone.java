
// one to one mapping for n entitys of person and passport
import java.util.*;

class passport {
    int pid;
    String pcountry;

    passport(int pid, String pcountry) {
        this.pid = pid;
        this.pcountry = pcountry;
    }
}

class person {
    int id;
    String name;
    passport p;

    person(int id, String name, passport p) {
        this.id = id;
        this.name = name;
        this.p = p;
    }
}

class Onetone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        person arr[] = new person[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter person id:");
            int id = sc.nextInt();
            System.out.println("Enter person name:");
            String name = sc.next();
            System.out.println("Enter passport id:");
            int pid = sc.nextInt();
            System.out.println("Enter passport country:");
            String pcountry = sc.next();
            passport p = new passport(pid, pcountry);
            arr[i] = new person(id, name, p);
        }
        System.out.println("Enter the person ID to display details:");
        int searchId = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i].id == searchId) {
                found = true;
                System.out.println("Person ID: " + arr[i].id);
                System.out.println("Person Name: " + arr[i].name);
                System.out.println("Passport ID: " + arr[i].p.pid);
                System.out.println("Passport Country: " + arr[i].p.pcountry);
                break;
            }
        }
        if (!found) {
            System.out.println("Person with ID " + searchId + " not found.");
        }
        sc.close();
    }

}