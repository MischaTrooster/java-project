import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ali", 22);
        Person p2 = new Person("Romy", 24);

        Group groep = new Group();
        groep.addPerson(p1);
        groep.addPerson(p2);

        System.out.println("lijst van mensen:");
        groep.printMensen();

        p1.setAge(30);
        System.out.println("\nNa aanpassen leeftijd:");
        System.out.println(p1.getName() + " is nu " + p1.getAge());

        try {
            p1.setAge(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("\nNa fouten input.");
            System.out.println("fout:" + e.getMessage());
        }

        System.out.println("\nGemiddelde leeftijd: " + groep.getGemiddeldeLeeftijd());

        Person oudste = groep.getOudstePersoon();
        if (oudste != null) {
            System.out.println("\nOudste persoon: " + oudste);
        }

    }
}
