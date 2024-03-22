package pagination;

import pagination.command.ICommand;

import java.util.HashMap;

public interface IExecutorCommand<T>{
    void execute(Integer command, IPagination<T> pagination);
    void addCommand(Integer key, ICommand<T> command);
    void setDefaultCommand(ICommand<T> command);

    HashMap<Integer, ICommand<T>> getCommands();

}
