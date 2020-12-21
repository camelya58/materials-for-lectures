package module04.lesson45_behavioral_patterns.command;

/**
 * Class LoginCommand
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class LoginCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Please enter the card number and pin");
    }
}
