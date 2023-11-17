public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindor1 = new Gryffindor("Гарри Поттер", 75, 85, 90, 90, 70);
        Gryffindor gryffindor2 = new Gryffindor("Гермиона Грейнджер", 80, 70, 80, 95, 70);
        Gryffindor gryffindor3 = new Gryffindor("Рон Уизли", 75, 70, 65, 65, 60);
        Slytherin slytherin1 = new Slytherin("Драко Малфой", 80, 75, 65, 85, 85, 70);
        Slytherin slytherin2 = new Slytherin("Грэхэм Монтегю", 75, 65, 80, 70, 65, 50);
        Slytherin slytherin3 = new Slytherin("Грегори Гойл", 50, 60, 45, 55, 50, 35);
        Hufflepuff hufflepuff1 = new Hufflepuff("Седрик Диггори", 90, 85, 80, 80, 90);
        Hufflepuff hufflepuff2 = new Hufflepuff("Захария Смит", 80, 70, 85, 60, 60);
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин Финч-Флетчли", 75, 60, 90, 75, 70);
        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу Чанг", 95, 70, 60, 75, 65, 70);
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма Патил", 80, 85, 70, 70, 60, 75);
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус Белби", 85, 70, 55, 55, 75, 55);

        gryffindor1.printStudentDescription();
        gryffindor2.printStudentDescription();
        gryffindor3.printStudentDescription();
        slytherin1.printStudentDescription();
        slytherin2.printStudentDescription();
        slytherin3.printStudentDescription();
        hufflepuff1.printStudentDescription();
        hufflepuff2.printStudentDescription();
        hufflepuff3.printStudentDescription();
        ravenclaw1.printStudentDescription();
        ravenclaw2.printStudentDescription();
        ravenclaw3.printStudentDescription();

        gryffindor1.compareGryffindorStudents(gryffindor2, gryffindor3);
        gryffindor2.compareGryffindorStudents(gryffindor1, gryffindor3);
        gryffindor3.compareGryffindorStudents(gryffindor1, gryffindor2);
        System.out.println();
        slytherin1.compareSlytherinStudents(slytherin2, slytherin3);
        slytherin2.compareSlytherinStudents(slytherin1, slytherin3);
        slytherin3.compareSlytherinStudents(slytherin1, slytherin2);
        System.out.println();
        hufflepuff1.compareHufflepuffStudents(hufflepuff2, hufflepuff3);
        hufflepuff2.compareHufflepuffStudents(hufflepuff1, hufflepuff3);
        hufflepuff3.compareHufflepuffStudents(hufflepuff1, hufflepuff2);
        System.out.println();
        ravenclaw1.compareRavenclawStudents(ravenclaw2, ravenclaw3);
        ravenclaw2.compareRavenclawStudents(ravenclaw1, ravenclaw3);
        ravenclaw3.compareRavenclawStudents(ravenclaw1, ravenclaw2);
        System.out.println();

        compareStudents(gryffindor1, hufflepuff1);
        compareStudents(gryffindor1, ravenclaw1);
        compareStudents(gryffindor1, slytherin1);
        compareStudents(hufflepuff1, ravenclaw1);
        compareStudents(hufflepuff1, slytherin1);
        compareStudents(ravenclaw1, slytherin1);

    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getStudentName() + " сильнее, чем " + student2.getStudentName());
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getStudentName() + " сильнее, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по силе");
        }

        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getStudentName() + " может трансгрессировать дальше, чем " + student2.getStudentName());
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getStudentName() + " может трансгрессировать дальше, чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " могут трансгрессировать на одинаковое расстояние");
        }
    }
}
