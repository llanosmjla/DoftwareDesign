package pagination;

import pagination.command.ICommand;

import java.util.HashMap;

public class ExecutorCommand<T> implements IExecutorCommand<T> {

    private final HashMap<Integer, ICommand<T>> commands = new HashMap<>();
    private ICommand<T> defaultCommand;

    @Override
    public void execute(Integer command, IPagination<T> pagination) {
        if(commands.containsKey(command)){
            commands.get(command).execute(pagination);
        } else {
            defaultCommand.execute(pagination);
        }
    }

    @Override
    public void addCommand(Integer key, ICommand<T> command) {
        commands.put(key, command);
    }

    @Override
    public void setDefaultCommand(ICommand<T> command) {
        defaultCommand = command;
    }

    @Override
    public HashMap<Integer, ICommand<T>> getCommands() {
        return commands;
    }
}
