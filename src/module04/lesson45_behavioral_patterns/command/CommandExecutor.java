package module04.lesson45_behavioral_patterns.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Class CommandExecutor
 *
 * @author Kamila Meshcheryakova
 * created 21.12.2020
 */
public class CommandExecutor {

    private static final Map<Operation, Command> commandsMap = new HashMap<>();

    private CommandExecutor() {

    }

    static {
        commandsMap.put(Operation.LOGIN, new LoginCommand());
        commandsMap.put(Operation.INFO, new InfoCommand());
        commandsMap.put(Operation.DEPOSIT, new DepositCommand());
        commandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        commandsMap.put(Operation.EXIT, new ExitCommand());
    }

    public static void execute(Operation operation) {
        commandsMap.get(operation).execute();
    }
}
