import java.util.ArrayList;
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Titel: ");
                    String title = sc.nextLine();

                    System.out.print("Beschrijving: ");
                    String description = sc.nextLine();

                    System.out.print("Deadline: ");
                    String deadline = sc.nextLine();

                    Task newTask = new Task(title, description, deadline);
                    tasks.add(newTask);

                    System.out.println("Taak toegevoegd!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Geen taken gevonden.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Voer index van taak in: ");
                    int removeIndex = sc.nextInt();
                    sc.nextLine();

                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        tasks.remove(removeIndex);
                        System.out.println("Taak verwijderd!");
                    } else {
                        System.out.println("Ongeldige index.");
                    }
                    break;

                case 4:
                    System.out.print("Voer index van taak in: ");
                    int completeIndex = sc.nextInt();
                    sc.nextLine();

                    if (completeIndex >= 0 && completeIndex < tasks.size()) {
                        tasks.get(completeIndex).markCompleted();
                        System.out.println("Taak afgerond!");
                    } else {
                        System.out.println("Ongeldige index.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Programma afgesloten.");
                    break;

                default:
                    System.out.println("Ongeldige keuze.");
            }
        }

        sc.close();
    }
}