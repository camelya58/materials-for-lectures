package module02.lesson12_generics.record.game;

public class Game {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Olga", 14);
        Pupil pupil2 = new Pupil("Ivan", 13);

        Student student1 = new Student("Anna", 20);
        Student student2 = new Student("Oleg", 21);

        Teacher teacher1 = new Teacher("Artem", 30);
        Teacher teacher2 = new Teacher("Inna", 32);

        Team<Pupil> pupilTeam = new Team<>("Pupils");
        Team<Student> studentTeam = new Team<>("Students");
        Team<Teacher> teacherTeam = new Team<>("Teachers");

        pupilTeam.getNewParticipant(pupil1);
        pupilTeam.getNewParticipant(pupil2);

        studentTeam.getNewParticipant(student1);
        studentTeam.getNewParticipant(student2);

        teacherTeam.getNewParticipant(teacher1);
        teacherTeam.getNewParticipant(teacher2);

        //Team<String> team = new Team<>();

        Team<Pupil> pupilTeam1 = new Team<>("Pupils2");
        Pupil pupil3 = new Pupil("Masha", 14);
        Pupil pupil4 = new Pupil("Anton", 12);

        pupilTeam1.getNewParticipant(pupil3);
        pupilTeam1.getNewParticipant(pupil4);

        pupilTeam.playWith(pupilTeam1);
    }
}
