public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence,
                     int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
}
