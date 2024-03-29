package pagination.command;

import pagination.IPagination;

public class PreviousCommand<T> implements ICommand<T> {

    @Override
    public void execute(IPagination<T> pagination) {
        pagination.previous();
    }
}
