package module04.lesson45_behavioral_patterns.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class CommandPattern demonstrates the work of command pattern, which
 * allows to wrap queries or simple operations into separate objects.
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class CommandPattern {

    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Operation operation = Operation.LOGIN;
        CommandExecutor.execute(operation);
        do {
            System.out.println("Write the name of command: Info, Deposit, Withdraw, Exit");
            operation = Operation.valueOf(reader.readLine().toUpperCase());
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
    }
}
