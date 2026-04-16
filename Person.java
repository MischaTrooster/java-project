public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn!");
        }
        this.name = name;
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Getter age
    public int getAge() {
        return age;
    }

    // Setter age (met check)
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("leeftijd mag niet negatief worden!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }

}