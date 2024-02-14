import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Aggiungi n elementi (Esempio con 2 elementi)
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 23));

        // Stampa l'ArrayList
        System.out.println("ArrayList iniziale:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Aggiungi 4 elementi
        students.add(new Student("Charlie", 20));
        students.add(new Student("Dana", 21));
        students.add(new Student("Evan", 22));
        students.add(new Student("Fiona", 23));

        // Stampa l'ArrayList aggiornato
        System.out.println("\nArrayList dopo l'aggiunta di 4 elementi:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
