package module04.lesson45_behavioral_patterns.command;

/**
 * Class ExitCommand
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Goodbye and Welcome back!");
    }
}
