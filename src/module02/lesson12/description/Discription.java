package module02.lesson12.description;

import module02.lesson12.example.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс Discription
 * 1. Определение дженериков.
 * Это обобщения. Набор свойств языка, позволяющих определять и использовать обобщенные типы и методы.
 * 2. Причины существования Дженериков:
 * - безопасность типов - Type safe;
 * - чтобы не создавать дублирующий код - Reusable code; (не надо писать отдельный лист для String, Integer и т.д.).
 * interface List<E> extends Collection<E>
 *
 * 3. Параметризованные классы и типы обозначений
 * T - параметризованный тип, E - элемент коллекции, K - key, V - value
 * если place holder <T> прописан в классе, то в методах перед T его не надо уже помещать
 *
 * 4. Создание классов с одним типом, с несколькими одинаковыми или разными.
 *
 * 5. Параметризованные методы.
 * Синтаксис написания.
 *
 * 6. Стирание типов - Type erasure.
 * Поскольку generics появились только в 5 версии, для совместимости кода происходит затирание типов.
 * JVM видит все дженерики как хранение Object.
 * Но в дальнейшем происходит приведение типа к указанному дженерику.
 *
 * Из-за этих двух причин невозможно неперегрузка и переопределение методов различающихся только типом дженерика.
 *
 * 7. Ограничение типов.
 * class Info<T extends Number> {}
 * Расширение типа <T extends Number> означает Number и subclass.
 * Можно наследовать один класс и несколько интерфейсов <T extends Number & I1 & I2>
 *
 * 8. Wildcards (термин из карт - Джокер)
 * <?> - обозначение любого типа
 * Использование в параметрах метода и при создании листа в майн.
 *
 * 9. Bounded wildcards.
 * Расширение типа <? extends Number> означает Number и subclass.
 * Использование в параметрах метода.
 *
 * <? super Number>  означает Number и superclass.
 * Использование в параметрах метода.
 *
 * 10. Показать написание игры - практическое применение дженериков.
 * 10.1. Создадим класс Participant.
 * 10.2. Создадим классы наследники: Pupil, Student и Teacher.
 * 10.3. Создадим первоначальный вариант Team.
 * 10.4. Создадим первоначальный вариант Game.
 * 10.5. Внесем соответствующие правки в классы.
 *
 *
 * 11. Задать вопрсы к собеседованию.
 * - Что такое дженерики?
 * - Какова цель использования обобщенных типов? (использование обобщенных коллекций)
 * - Что такое стирание типа?
 * - Что такое параметр ограниченного типа? <T extends Number>
 * - Можно ли объявить параметр с несколькими ограниченными типами?
 * - Что такое подстановочный тип? <?>
 *
 * @author Kamila Meshcheryakova
 * created 21.08.2020
 */
public class Discription {
}
/* Первоначальный вариант
 public class Team {  /2. Team replace to Team<T>  /3. replace to Team<T extends Participant

    private String name;
    private List<Participant> participants = new ArrayList<>(); /2. List<Participant> replace to List<T>


    public Team(String name) {
        this.name = name;
    }

    public void getNewParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("New participant " + participant.getName() + " was added in a team.");
    }

/2.    public void getNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("New participant " + ((Participant)participant).getName() + " was added in a team.");
    }

/3.   public void getNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("New participant " + participant.getName() + " was added in a team " + this.name + ".");
    }

    public void playWith(Team team) {
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

/2.    public void playWith(Team<T> team) {
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

 */
