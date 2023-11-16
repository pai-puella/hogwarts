public class Hufflepuff extends Hogwarts {
    private String studentName;
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int diligence, int loyalty,
                      int honesty, int magicPower, int transgressionDistance){
        super(magicPower, transgressionDistance);
        this.studentName = studentName;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void printStudentDescription() {
        System.out.println("Студент Пуффендуя: " + studentName);
        System.out.println("Сила магии " + getMagicPower());
        System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        System.out.println("Дополнительные качества факультета Пуффендуй");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
        super.printStudentDescription();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
