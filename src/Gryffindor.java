public class Gryffindor extends Hogwarts {
    private String studentName;
    //private int studentQuality;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int nobility, int honor, int bravery,
                      int magicPower, int transgressionDistance) {
        super(studentName, magicPower, transgressionDistance);
        this.studentName = studentName;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printStudentDescription() {
        System.out.println("Студент Гриффиндора: " + studentName);
        //System.out.println("Сила магии " + getMagicPower());
        //System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Гриффиндор: ");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
        System.out.println();
    }

    public void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;

        if (sum1 > sum2) {
            System.out.println(student1.getStudentName() + " лучший Гриффиндорец, чем " + student2.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getStudentName() + " лучший Гриффиндорец, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " в равной степени Гриффиндорцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
