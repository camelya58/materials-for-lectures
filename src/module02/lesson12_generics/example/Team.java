package module02.lesson12_generics.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс Team
 *
 * @author Kamila Meshcheryakova
 * created 22.08.2020
 */
public class Team<T extends Participant> {  // Team replace to Team<T> replace to Team<T extends Participant

    private String name;
   // private List<Participant> participants = new ArrayList<>();
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

//    public void getNewParticipant(Participant participant) {
//        participants.add(participant);
//        System.out.println("New participant " + participant.getName() + " was added in a team.");
//    }

//    public void getNewParticipant(T participant) {
//        participants.add(participant);
//        System.out.println("New participant " + ((Participant)participant).getName() + " was added in a team.");
//    }

    public void getNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("New participant " + participant.getName() + " was added in a team " + this.name + ".");
    }

//    public void playWith(Team team) {
//        String winnerTeam;
//        Random random = new Random();
//        int i = random.nextInt(2);
//        if (i == 0) {
//            winnerTeam = this.name;
//        } else {
//            winnerTeam = team.name;
//        }
//        System.out.println("The winner is " + winnerTeam + ".");
//    }

    public void playWith(Team<T> team) {
        String winnerTeam;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerTeam = this.name;
        } else {
            winnerTeam = team.name;
        }
        System.out.println("The winner is " + winnerTeam + ".");
    }
}
