package pagination.command;

import pagination.IExecutorCommand;
import pagination.IPagination;

import java.util.HashMap;

public class HelpCommand<T> implements ICommand<T>{
    IExecutorCommand<T> executorCommand;

    public HelpCommand(IExecutorCommand<T> executorCommand) {

        this.executorCommand = executorCommand;
    }
    @Override
    public void execute(IPagination<T> pagination) {
        HashMap<Integer, ICommand<T>> commands = executorCommand.getCommands();
        for (Integer command : commands.keySet()) {
            System.out.println("Item: " + command);
        }

    }
}
