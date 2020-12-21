package module04.lesson45_behavioral_patterns.command;

/**
 * Class InfoCommand
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class InfoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No money available");
    }
}
