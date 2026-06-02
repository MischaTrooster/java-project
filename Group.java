import java.util.ArrayList;

public class Group {
    private ArrayList<Person> mensen;

    public Group() {
        mensen = new ArrayList<>();
    }

    public void addPerson(Person p) {
        mensen.add(p);
    }

    public void printMensen() {
        for (Person p : mensen) {
            System.out.println(p);
        }
    }

    public double getGemiddeldeLeeftijd() {
        if (mensen.isEmpty()) {
            return 0;
        }

        int totaal = 0;

        for (Person p : mensen) {
            totaal += p.getAge();
        }

        return totaal / (double) mensen.size();
    }

    public int size() {
        return mensen.size();
    }

    public Person getOudstePersoon() {
        if (mensen.isEmpty()) {
            return null;
        }

        Person oudste = mensen.get(0);

        for (Person p : mensen) {
            if (p.getAge() > oudste.getAge()) {
                oudste = p;
            }
        }
        return oudste;
    }

}
 