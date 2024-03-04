package lists.command;

import lists.IPagination;

public class ExitCommand<T> implements ICommand<String>{
    @Override
    public void execute(IPagination<String> pagination) {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
