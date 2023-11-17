public class Slytherin extends Hogwarts {
    private String studentName;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

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
        //System.out.println("Сила магии " + getMagicPower());
        //System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Слизерин");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбицизность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
        System.out.println();
    }

    public void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;

        if (sum1 > sum2) {
            System.out.println(student1.getStudentName() + " лучший Слизеринец, чем " + student2.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getStudentName() + " лучший Слизеринец, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " в равной степени Слизеринцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
