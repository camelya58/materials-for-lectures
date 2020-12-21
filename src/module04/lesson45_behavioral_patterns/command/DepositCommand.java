package module04.lesson45_behavioral_patterns.command;

/**
 * Class DepositCommand
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class DepositCommand implements Command {

    @Override
    public void execute() {
        System.out.println("You have deposited 100 rubles");
    }
}
