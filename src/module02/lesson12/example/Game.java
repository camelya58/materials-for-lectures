package module02.lesson12.example;

/**
 * Класс Game
 *
 * @author Kamila Meshcheryakova
 * created 22.08.2020
 */
public class Game {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Olga", 12);
        Pupil pupil2 = new Pupil("Oleg", 15);

        Student student1 = new Student("Irina", 20);
        Student student2 = new Student("Igor", 22);

        Teacher teacher1 = new Teacher("Anna", 32);
        Teacher teacher2 = new Teacher("Aleksey", 36);

// 1      Team pupilTeam = new Team("Umniki");
//        Team studentTeam = new Team("Aktivisty");
//        Team teacherTeam = new Team("Avtoritety");

//        pupilTeam.getNewParticipant(student1); // wrong - we must add only pupil in a pupilTeam
//        pupilTeam.getNewParticipant(teacher1); // wrong

        Team<Pupil> pupilTeam = new Team<>("Umniki");
        Team<Student> studentTeam = new Team<>("Aktivisty");
        Team<Teacher> teacherTeam = new Team<>("Avtoritety");

        pupilTeam.getNewParticipant(pupil1);
        pupilTeam.getNewParticipant(pupil2);

        studentTeam.getNewParticipant(student1);
        studentTeam.getNewParticipant(student2);

        teacherTeam.getNewParticipant(teacher1);
        teacherTeam.getNewParticipant(teacher2);

//        Team<String> otherTeam = new Team("Another"); // wrong - we must add only class extends Participant

        //pupilTeam.playWith(studentTeam); // wrong - pupilTeam must play only with another pupilTeam

        Team<Pupil> pupilTeam2 = new Team<>("Umnici");
        Pupil pupil3 = new Pupil("Tanya", 13);
        Pupil pupil4 = new Pupil("Tolya", 14);

        pupilTeam2.getNewParticipant(pupil3);
        pupilTeam2.getNewParticipant(pupil4);

        pupilTeam.playWith(pupilTeam2);
    }
}
