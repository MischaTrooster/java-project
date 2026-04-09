import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> mensen = new HashMap<>();

        mensen.put("Ali", 44);
        mensen.put("Romy", 24);
        mensen.put("Diana", 22);

        for (String naam : mensen.keySet()){
            System.out.println(naam + " is "  + mensen.get(naam));
        }

        System.out.println("Voer een naam in:");
        String naam = sc.nextLine();


        try{  
            System.out.println("Voer een leeftijd in:");
            int leeftijd = sc.nextInt();
            sc.nextLine();

            if(leeftijd < 0){
                System.out.println("Leeftijd kan niet negatief zijn!");
            }

            mensen.put(naam, leeftijd);
        } catch(Exception e) {
             System.out.println("Je moet een getal invoeren!");
        }

        int totaal = 0;
        for(int leeftijdWaarde : mensen.values()){
            totaal += leeftijdWaarde;
        }

        double gemiddelde = totaal / (double) mensen.size();

        System.out.println("Gemiddelde leeftijd: " + gemiddelde); 


        System.out.println("Nieuwe lijst:");
        for (String naam2 : mensen.keySet()) {
            System.out.println(naam2 + " is " + mensen.get(naam2));
        }
    } 
}