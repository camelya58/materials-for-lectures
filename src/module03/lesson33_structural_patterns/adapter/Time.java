package module03.lesson33_structural_patterns.adapter;

/**
 * Интерфейсы Time и TotalTime
 *
 * @author Kamila Meshcheryakova
 * created 01.11.2020
 */
public interface Time {

    // методы позволяют получить текущее время
    int getSeconds();
    int getMinutes();
    int getHours();
}

interface TotalTime {

    // метод позволяет получить количество секунд? прошедших после полуночи
    int getTotalSeconds();
}
