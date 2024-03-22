package pagination.command;

import pagination.IPagination;

public class PrintCommand implements ICommand<String> {

    @Override
    public void execute(IPagination<String> pagination) {
        pagination.print(pagination.getItems(), 1);
    }

}
