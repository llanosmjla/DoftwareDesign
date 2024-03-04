package lists.command;

import lists.IExecutorCommand;
import lists.IPagination;

import java.util.HashMap;

public class HelpCommand<T> implements ICommand<T>{
    IExecutorCommand<T> executorCommand;

    public HelpCommand(IExecutorCommand<T> executorCommand) {

        this.executorCommand = executorCommand;
    }
    @Override
    public void execute(IPagination<T> pagination) {
        HashMap<String, ICommand<T>> commands = executorCommand.getCommands();
        for (String command : commands.keySet()) {
            System.out.println("Item: " + command);
        }

    }
}
