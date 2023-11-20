public class Ravenclaw extends Hogwarts {
    private final String studentName;
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String studentName,  int intelligence,
                     int wisdom, int wit, int creativity,
                     int magicPower, int transgressionDistance) {
        super(studentName, magicPower, transgressionDistance);
        this.studentName = studentName;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void printStudentDescription() {
        System.out.println("Студент Когтеврана: " + studentName);
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Когтевран:");
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
        System.out.println();
    }

    public void compareRavenclawStudents(Ravenclaw student) {
        int sum1 = student.intelligence + student.wisdom + student.wit + student.creativity;
        int sum2 = this.intelligence + this.wisdom + this.wit + this.creativity;

        if (sum1 > sum2) {
            System.out.println(student.getStudentName() + " лучший Когтевранец, чем " + this.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(this.getStudentName() + " лучший Когтевранец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " в равной степени Когтевранцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
