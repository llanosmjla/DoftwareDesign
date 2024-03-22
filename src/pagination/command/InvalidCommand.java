package pagination.command;

import pagination.IPagination;

public class InvalidCommand<T> implements ICommand<T>{

    @Override
    public void execute(IPagination<T> pagination) {
        System.out.println("Invalid command");
    }
}
