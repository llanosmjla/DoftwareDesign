package lists.command;

import lists.IPagination;

import java.util.Scanner;

public class SetItemsPerPageCommand implements ICommand<String>{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void execute(IPagination<String> pagination) {
        System.out.println("Enter the number of items per page: ");
        int itemsPerPage = scanner.nextInt();
        pagination.setItemsPerPage(itemsPerPage);
    }
}
