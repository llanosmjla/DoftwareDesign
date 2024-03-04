package lists;

import lists.command.ICommand;

import java.util.HashMap;

public class ExecutorCommand<T> implements IExecutorCommand<T> {

    private final HashMap<String, ICommand<T>> commands = new HashMap<>();
    private ICommand<T> defaultCommand;

    @Override
    public void execute(String command, IPagination<T> pagination) {
        if(commands.containsKey(command)){
            commands.get(command).execute(pagination);
        } else {
            defaultCommand.execute(pagination);
        }
    }

    @Override
    public void addCommand(String key, ICommand<T> command) {
        commands.put(key, command);
    }

    @Override
    public void setDefaultCommand(ICommand<T> command) {
        defaultCommand = command;
    }

    @Override
    public HashMap<String, ICommand<T>> getCommands() {
        return commands;
    }
}
