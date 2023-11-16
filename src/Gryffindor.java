public class Gryffindor extends Hogwarts {
    private String studentName;
    //private int studentQuality;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int nobility, int honor, int bravery,
                      int magicPower, int transgressionDistance) {
        super(magicPower, transgressionDistance);
        this.studentName = studentName;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void describeGrStudent() {
        System.out.println("Студент Гриффиндора: " + studentName);
        System.out.println("Сила магии " + getMagicPower());
        System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        System.out.println("Дополнительные качества факультета Гриффиндор: ");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }
}
