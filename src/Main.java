public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(90, 50, 80, 90, 70);
        Gryffindor hermioneGranger = new Gryffindor(95, 60, 90, 80,75);
        Gryffindor ronWeasley = new Gryffindor(85, 55, 70, 85, 65);

        harryPotter.describeStudent();
        hermioneGranger.describeStudent();
        ronWeasley.describeStudent();

        harryPotter.compareStudents(hermioneGranger, ronWeasley);
    }
}
