package module03.lesson33.adapter;

import java.time.LocalTime;

/**
 * Класс TimeAdapter
 *
 * @author Kamila Meshcheryakova
 * created 01.11.2020
 */
public class TimeAdapter implements TotalTime {

    private final Time time;

    public TimeAdapter(Time time) {
        this.time = time;
    }

    @Override
    public int getTotalSeconds() {
        return time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
    }

    public static void main(String[] args) {
        Time time = new Time() {
            @Override
            public int getSeconds() {
                LocalTime localTime = LocalTime.now();
                return localTime.getSecond();
            }

            @Override
            public int getMinutes() {
                LocalTime localTime = LocalTime.now();
                return localTime.getMinute();
            }

            @Override
            public int getHours() {
                LocalTime localTime = LocalTime.now();
                return localTime.getHour();
            }
        };
        TotalTime totalTime = new TimeAdapter(time);
        System.out.println(totalTime.getTotalSeconds());
    }
}
