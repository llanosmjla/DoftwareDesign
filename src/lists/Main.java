package lists;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IExecutorCommand<String> executor = FactoryExecutorCommand.get();
        IPagination<String> pagination = new Pagination<>();

        while (true) {
            System.out.println("Enter a command: ");
            String command = scanner.nextLine();
            executor.execute(command, pagination);

        }

    }
}
