
public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts (int magicPower, int transgressionDistance){
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void printStudentDescription() {
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии:" + transgressionDistance);
    }
    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
