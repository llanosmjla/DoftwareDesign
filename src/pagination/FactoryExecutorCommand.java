package pagination;

import pagination.command.*;

public class FactoryExecutorCommand {
    static IExecutorCommand<String> get(){
        IExecutorCommand<String> executorCommand = new ExecutorCommand<>();
        executorCommand.setDefaultCommand(new InvalidCommand<>());
        executorCommand.addCommand(1, new AddCommand());
        executorCommand.addCommand(2, new SetItemsPerPageCommand());
        executorCommand.addCommand(3, new FirstCommand());
        executorCommand.addCommand(4, new LastCommand());
        executorCommand.addCommand(5, new NextCommand());
        executorCommand.addCommand(6, new PreviousCommand<>());
        executorCommand.addCommand(7, new PrintCommand());
        executorCommand.addCommand(8, new ExitCommand<String>());

        executorCommand.addCommand(9, new HelpCommand<>(executorCommand));
        return executorCommand;
    }
}
