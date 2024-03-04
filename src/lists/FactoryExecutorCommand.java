package lists;

import lists.command.*;

public class FactoryExecutorCommand {
    static IExecutorCommand<String> get(){
        IExecutorCommand<String> executorCommand = new ExecutorCommand<>();
        executorCommand.setDefaultCommand(new InvalidCommand<>());
        executorCommand.addCommand("exit", new ExitCommand<String>());
        executorCommand.addCommand("add", new AddCommand());
        executorCommand.addCommand("first", new FirstCommand());
        executorCommand.addCommand("next", new NextCommand());
        executorCommand.addCommand("previous", new PreviousCommand<>());
        executorCommand.addCommand("print", new PrintCommand());
        executorCommand.addCommand("size", new SetItemsPerPageCommand());

        executorCommand.addCommand("help", new HelpCommand<>(executorCommand));
        return executorCommand;
    }
}
