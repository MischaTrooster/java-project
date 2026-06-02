public class Task {

    private String title;
    private String description;
    private String deadline;
    private boolean completed;

    public Task(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return "Taak: " + title +
               " | Beschrijving: " + description +
               " | Deadline: " + deadline +
               " | Afgerond: " + completed;
    }
}