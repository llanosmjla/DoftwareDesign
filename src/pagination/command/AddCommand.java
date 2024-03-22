package pagination.command;

import pagination.IPagination;

import java.util.Scanner;

public class AddCommand implements ICommand<String>{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(IPagination<String> pagination) {
        System.out.println("Enter the item to add: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        pagination.add(item);
    }
}
