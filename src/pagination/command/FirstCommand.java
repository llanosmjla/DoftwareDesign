package pagination.command;

import pagination.IPagination;

public class FirstCommand implements ICommand<String>{

    @Override
    public void execute(IPagination<String> pagination) {
        pagination.first();
    }
}
