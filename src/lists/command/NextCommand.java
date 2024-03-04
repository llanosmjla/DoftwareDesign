package lists.command;

import lists.IPagination;

public class NextCommand implements ICommand<String>{

    @Override
    public void execute(IPagination<String> pagination) {
        pagination.next();
    }
}
