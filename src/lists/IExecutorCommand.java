package lists;

import lists.command.ICommand;

import java.util.HashMap;

public interface IExecutorCommand<T>{
    void execute(String command, IPagination<T> pagination);
    void addCommand(String key, ICommand<T> command);
    void setDefaultCommand(ICommand<T> command);

    HashMap<String, ICommand<T>> getCommands();

}
