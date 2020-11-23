package module03.lesson33_structural_patterns.adapter;

import java.time.LocalTime;

/**
 * Класс TotalTimeAdapter
 *
 * @author Kamila Meshcheryakova
 * created 01.11.2020
 */
public class TotalTimeAdapter implements Time {

    private final TotalTime totalTime;

    public TotalTimeAdapter(TotalTime totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int getSeconds() {
        return totalTime.getTotalSeconds() % 60;
    }

    @Override
    public int getMinutes() {
        return totalTime.getTotalSeconds() / 60 % 60;
    }

    @Override
    public int getHours() {
        return totalTime.getTotalSeconds() / (60 * 60);
    }

    public static void main(String[] args) {
        TotalTime totalTime = new TotalTime() {
            @Override
            public int getTotalSeconds() {
                LocalTime time = LocalTime.now();
                return time.toSecondOfDay();
            }
        };
        Time time = new TotalTimeAdapter(totalTime);
        System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
    }
}
