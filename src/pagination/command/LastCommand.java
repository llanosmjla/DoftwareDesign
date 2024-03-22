package pagination.command;

import pagination.IPagination;

public class LastCommand implements ICommand<String> {

    @Override
    public void execute(IPagination<String> pagination) {
        pagination.last();
    }
}
