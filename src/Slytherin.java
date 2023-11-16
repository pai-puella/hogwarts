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
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void describeSlStudent() {
        System.out.println("Студент Слизерина: " + studentName);
        System.out.println("Сила магии " + getMagicPower());
        System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
        System.out.println("Дополнительные качества факультета Слизерин");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбицизность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
