public class Ravenclaw extends Hogwarts {
    private String studentName;
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

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
        //System.out.println("Сила магии " + getMagicPower());
        //System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Когтевран:");
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
        System.out.println();
    }

    public void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int sum2 = student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        if (sum1 > sum2) {
            System.out.println(student1.getStudentName() + " лучший Когтевранец, чем " + student2.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getStudentName() + " лучший Когтевранец, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " в равной степени Когтевранцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
