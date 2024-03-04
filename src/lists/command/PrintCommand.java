package lists.command;

import lists.IPagination;

public class PrintCommand implements ICommand<String>{

    private final int currentNumberOnPage = 1;
    private final int itemsPerPage = 10;
    private final int currentIndex = 1;
    private final int totalPages = 0;

    @Override
    public void execute(IPagination<String> pagination) {
        for (String item : pagination.getItems()) {
            System.out.println("Item: " + item);
        }
    }
}
