public class Gryffindor extends Hogwarts {
    private final String studentName;
    private final int nobility;
    private final int honor;
    private final int bravery;

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
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Гриффиндор: ");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
        System.out.println();
    }

    public void compareGryffindorStudents(Gryffindor student) {
        int sum1 = student.nobility + student.honor + student.bravery;
        int sum2 = this.nobility + this.honor + this.bravery;

        if (sum1 > sum2) {
            System.out.println(student.getStudentName() + " лучший Гриффиндорец, чем " + this.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(this.getStudentName() + " лучший Гриффиндорец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " в равной степени Гриффиндорцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
