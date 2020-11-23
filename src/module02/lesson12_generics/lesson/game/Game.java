package module02.lesson12_generics.lesson.game;

public class Game {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Olga", 12);
        Pupil pupil2 = new Pupil("Oleg", 14);

        Student student1 = new Student("Ivan", 19);
        Student student2 = new Student("Inna", 20);

        Teacher teacher1 = new Teacher("Anna", 34);
        Teacher teacher2 = new Teacher("Alexey", 30);

        Team<Pupil> pupilTeam = new Team<>("Pupils");
        Team<Student> studentTeam = new Team<>("Students");
        Team<Teacher> teacherTeam = new Team<>("Teachers");

        pupilTeam.addNewParticipant(pupil1);
        pupilTeam.addNewParticipant(pupil2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        teacherTeam.addNewParticipant(teacher1);
        teacherTeam.addNewParticipant(teacher2);

       // Team<String> stringTeam = new Team<>("Hello");

        //pupilTeam.playWith(studentTeam);

        Team<Pupil> pupilTeam2 = new Team<>("Pupils2");
        Pupil pupil3 = new Pupil("Elena", 12);
        Pupil pupil4 = new Pupil("Evgeniy", 14);

        pupilTeam2.addNewParticipant(pupil3);
        pupilTeam2.addNewParticipant(pupil4);

        pupilTeam.playWith(pupilTeam2);

    }
}
