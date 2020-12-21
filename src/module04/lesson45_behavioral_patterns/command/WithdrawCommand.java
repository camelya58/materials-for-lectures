package module04.lesson45_behavioral_patterns.command;

/**
 * Class WithdrawCommand
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class WithdrawCommand implements Command {

    @Override
    public void execute() {
        System.out.println("You have withdrawn 100 rubles");
    }
}
