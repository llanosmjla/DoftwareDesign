package lists.command;

import lists.IPagination;

public class FirstCommand implements ICommand<String>{

    @Override
    public void execute(IPagination<String> pagination) {
        pagination.first();
    }
}
