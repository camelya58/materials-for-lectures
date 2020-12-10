package module04.lesson41_daemon;

/**
 * Thread grouping. Daemon streams.
 * 1. Определение потоков-демонов.
 * Daemon-потоки предназначены для выполнения фоновых задач и оказания различных сервисов User потокам.
 *
 * 2. Создание потоков-демонов. Принципы работы.
 * Работа обычных потоков не зависит от работы мэйн. Программа завершится только после завершения работы всех потоков.
 * В то время как, если все обычные потоки завершены, программа завершится, не дожидаясь окончания работы демон потоков.
 *
 * Примерами демон-потоков могут служить большинство потоков JVM: работа уборщика-мусора, освобождение памяти и т.д.
 *
 * 3. Определение группы потоков.
 *
 * Группа потоков представляет собой набор нитей, которые также могут содержать в себе другие группы потоков.
 * Группа нитей образует дерево, в котором каждая другая группа нитей имеет родителя (кроме исходной).
 * Поток имеет право доступа к данным из своей группы нитей, но не имеет такого доступа к другим группам или
 * к родительской группе потоков.
 *
 * Каждая группа потоков исполнения представляется объектом класса ThreadGroup.
 * Группы потоков (thread groups) улучшают вопросы, связанные с управляемостью и безопасностью, а именно:
 *
 * - Можно прервать работу сразу всех потоков группы.
 * - Установить для них единое максимальное значение приоритета выполнения.
 * - Наложить ограничения на способность потоков, принадлежащих группе, выполнять те или иные действия.
 *
 * 4. Создание группы и методы работы с группой.
 * class ThreadGroupExample
 *
 * ThreadGroup getParent()	- возвращает группу-родителя;
 * void interrupt()	- прерывает все нити в группе;
 * boolean isDaemon() - проверяет, является ли группа демоном;
 * void setDaemon(boolean daemon) - устанавливает группе свойство daemon;
 * int activeCount()	- возвращает количество живых нитей в группе и ее подгруппах;
 * int activeGroupCount() - возвращает количество живых групп в группе и ее подгруппах;
 * int enumerate(Thread[] list)	- помещает в массив все живые нити и возвращает их количество;
 * int getMaxPriority()	- возвращает максимальный приоритет для нитей в группе;
 * void setMaxPriority(int priority)	- позволяет задать максимальный приоритет нитей в группе и подгруппах.
 *
 * class ThreadGroupSample
 *
 * 5. Volatile
 * Запрет на кэширование данных. Пример.
 *
 * class VolatileExample
 *
 * 6. Гонка данных - Data race
 * Это проблема, которая может возникнуть, когда два и более потоков обращаются к одной и той же переменной
 * и как минимум один поток ее изменяет.
 *
 * Выход - сонхронизация доступа к такой переменной.
 *
 * class DataRace
 *
 * 7. Синхронизированные блоки
 *
 * package synchronize
 *
 *
 * @author Kamila Meshcheryakova
 * created 09.12.2020
 */
public class Description {
}
