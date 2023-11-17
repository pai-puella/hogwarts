public class Hufflepuff extends Hogwarts {
    private String studentName;
    private int diligence;
    private int loyalty;
    private int honesty;

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
        //System.out.println("Сила магии " + getMagicPower());
        //System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        super.printStudentDescription();
        System.out.println("Дополнительные качества факультета Пуффендуй");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
        System.out.println();
    }

    public void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.diligence + student1.loyalty + student1.honesty;
        int sum2 = student2.diligence + student2.loyalty + student2.honesty;

        if (sum1 > sum2) {
            System.out.println(student1.getStudentName() + " лучший Пуффендуец, чем " + student2.getStudentName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getStudentName() + " лучший Пуффендуец, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " в равной степени Пуффендуйцы");
        }
    }

    public String getStudentName() {
        return studentName;
    }

}
