
abstract class Hogwarts {
    private final String studentName;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts (String studentName, int magicPower, int transgressionDistance){
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void printStudentDescription() {
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }
    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }
}
