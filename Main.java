import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mensen = new HashMap<>();

        mensen.put("Ali", 10);
        mensen.put("Sara", 41);
        mensen.put("Jill", 48);

        for (String naam : mensen.keySet()) {
            System.out.println(naam + " is " + mensen.get(naam));
        }

        System.out.println("Voer een naam in:");
        String naam = sc.nextLine();

        try {
            System.out.println("Voer een leeftijd in:");
            int leeftijd = sc.nextInt();
            sc.nextLine();

            mensen.put(naam, leeftijd);

        } catch (Exception e) {
            System.out.println("je moet een getal invoeren");
        }

        System.out.println("Nieuwe lijst:");
        for (String naam2 : mensen.keySet()) {
            System.out.println(naam2 + " is " + mensen.get(naam2));
        }
    }
}