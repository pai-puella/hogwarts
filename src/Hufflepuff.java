public class Hufflepuff extends Hogwarts {
    private final String studentName;
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String studentName, int diligence, int loyalty,
                      int honesty, int magicPower, int transgressionDistance){
        super(studentName, magicPower, transgressionDistance);
        this.studentName = studentName;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void printStudentDescription() {
        System.out.println("Студент Пуффендуя: " + studentName);
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Пуффендуй");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
        System.out.println();
    }

    public void compareHufflepuffStudents(Hufflepuff student) {
        int sum1 = student.diligence + student.loyalty + student.honesty;
        int sum2 = this.diligence + this.loyalty + this.honesty;

        if (sum1 > sum2) {
            System.out.println(student.getStudentName() + " лучший Пуффендуец, чем " + this.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(this.getStudentName() + " лучший Пуффендуец, чем " + student.getStudentName());
        } else {
            System.out.println(student.getStudentName() + " и " + this.getStudentName() + " в равной степени Пуффендуйцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }

}
