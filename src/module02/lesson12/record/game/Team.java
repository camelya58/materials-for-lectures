package module02.lesson12.record.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {

    private String name;

    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void getNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("New participant " + participant.getName() +
                " was added in team");
    }

    public void playWith(Team<T> team) {
        String winnerTeam;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerTeam = this.name;
        } else {
            winnerTeam = team.name;
        }
        System.out.println("The winner is " + winnerTeam);
    }
}
