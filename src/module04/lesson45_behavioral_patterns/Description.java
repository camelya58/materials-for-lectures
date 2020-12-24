package module04.lesson45_behavioral_patterns;

/**
 * Поведенческие паттерны
 * 1. Определение паттерна.
 * Шаблон проектирования, или паттерн, в разработке программного обеспечения — повторяемая архитектурная конструкция,
 * представляющая собой решение проблемы проектирования, в рамках некоторого часто возникающего контекста.
 *
 * 2. Поведенческие паттерны
 * Поведенческие паттерны — шаблоны проектирования, определяющие алгоритмы и способы реализации взаимодействия
 * различных объектов и классов.
 *
 * Список поведенческих шаблонов проектирования:
 - стратегия (Strategy);
 - итератор (Iterator);
 - наблюдатель (Observer);
 - хранитель (Memento);
 - команда (Command);
 - интерпретатор (Interpreter);
 - посредник (Mediator);
 - состояние (State);
 - шаблонный метод (Template method);
 - посетитель (Visitor);
 - цепочка ответственности (Chain of responsibility).
 *
 * 3. Command
 * Команда - это поведенческий паттерн, позволяющий заворачивать запросы или простые операции в отдельные объекты.
 *
 * Это позволяет откладывать выполнение команд, выстраивать их в очереди, а также хранить историю и делать отмену.
 * Мы инкапсулируе действие от получателя.
 *
 * Простым языком:
 * Паттерн «Команда» похож на то, как работают выключатели света в наших домах. Каждый выключатель делает простое
 * действие – соединяет или разъединяет два контакта. Что стоит за этими контактами выключателю неизвестно.
 * Этот паттерн просто определяет общие правила для объектов, без необходимости описания всей подоплеки.
 * Благодаря этому, одним типом выключателей можно взаимодействовать как с освещением, так и с чайником.
 *
 * 4. Interpreter
 * Интерпретатор — поведенческий шаблон проектирования, решающий часто встречающуюся, но подверженную изменениям, задачу.
 * Мы берем текст на вход, обрабатываем его и выдаем реузьтат.
 *
 * Пример из жизни: Используется при написании парсинга xml/html, компилятора.
 *
 * 5. Mediator
 * Посредник - поведенческий паттерн проектирования, позволяющий инкапсулировать и облегчить общение между объектами.
 *
 * Пример из жизни: самое популярное применение Посредника в Java-коде — это связь нескольких компонентов
 * GUI одной программы.
 *
 * 6. State
 * Состояние - поведенческий паттерн проектирования, позволяющий изменить поведение объекта при изменении его состояния.
 *
 * Состояние инкапсулируется в объект и в зависимости от состояния этого объекта изменяется его поведение.
 *
 * Простым языком:
 * Можно привести в качестве аналогии внутреннее состояние человека – оно может быть разным в разный момент времени.
 * Например, человек пришел с работы и получил запрос «Сходить в магазин». Такой запрос вызовет негативную выдачу
 * «не пойду». Однако, если завтра человеку никуда не надо, возможно, он захочет купить в магазине не только хлеб
 * насущный и результат обработки запроса будет ровно противоположным.
 * Итого: один объект, один запрос, разные результаты. Для определения результата и используется «состояние».
 *
 * @author Kamila Meshcheryakova
 * created 01.11.2020
 */
public class Description {
}
