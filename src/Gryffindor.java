public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void describeStudent() {
        System.out.println("Студент Гриффиндора: ");
        System.out.println("Сила магии " + getMagicPower());
        System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;

        if (sum1 > sum2) {
            System.out.println("Первый студент лучше второго");
        } else if (sum1 < sum2) {
            System.out.println("Второй студент лучше первого");
        } else {
            System.out.println("Оба студента равны");
        }
    }
}
