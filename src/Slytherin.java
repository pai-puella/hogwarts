public class Slytherin extends Hogwarts {
    private final String studentName;
    private final int cunning;
    private int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String studentName, int cunning, int ambition,
                     int resourcefulness, int lustForPower,
                     int magicPower, int transgressionDistance) {
        super(studentName, magicPower, transgressionDistance);
        this.studentName = studentName;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public void printStudentDescription() {
        System.out.println("Студент Слизерина: " + studentName);
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Слизерин");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбицизность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
        System.out.println();
    }

    public void compareSlytherinStudents(Slytherin student) {
        int sum1 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
        int sum2 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;

        if (sum1 > sum2) {
            System.out.println(student.getStudentName() + " лучший Слизеринец, чем " + this.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(this.getStudentName() + " лучший Слизеринец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " в равной степени Слизеринцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
