package lists.command;

import lists.IPagination;

public interface ICommand<T> {

    void execute(IPagination<T> pagination);

}
