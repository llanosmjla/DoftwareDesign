package pagination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IExecutorCommand<String> executor = FactoryExecutorCommand.get();
        IPagination<String> pagination = new Pagination<>();
        Display display = new Display();

        while (true) {
            display.menu();
            System.out.println("Enter a command: ");
            int command = scanner.nextInt();
            executor.execute(command, pagination);

        }

    }
}
