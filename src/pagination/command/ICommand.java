package pagination.command;

import pagination.IPagination;

public interface ICommand<T> {

    void execute(IPagination<T> pagination);

}
