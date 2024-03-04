package lists;

import lists.command.AddCommand;

import java.util.LinkedList;

public class Pagination<T> implements IPagination<T>{
    LinkedList<T> items = new LinkedList<>();
    int itemsPerPage;
    int currentPage = 1;

    @Override
    public void add(T item) {
        items.add(item);
        //System.out.println("Item added: " + item);
    }

    @Override
    public void first() {
        currentPage = 1;
        print(items, currentPage);
    }

    @Override
    public void next() {
        currentPage++;
        print(items, currentPage);
    }

    @Override
    public void previous() {
        if (!(currentPage > 1)){
            System.out.println("You are already on the first page");
            return;
        }
        currentPage--;
        print(items, currentPage);

    }

    @Override
    public void last() {
        currentPage = getTotalItemsPerPage(items);
        print(items, currentPage);
    }


    private void print(LinkedList<T> items, int currentPage) {

        int currentIndex = getCurrentIndex(currentPage);
        int itemsToSkip = itemsToSkip(currentPage);

        System.out.println("Total pages: " + items.size() + " items");
        for (int i = 0; i < items.size(); i++) {
            if (i + 1 == currentPage) {

                System.out.println("\n---------------------------------------------------");
                System.out.println("---------[Page: " +(i + 1) + " of "+getTotalItemsPerPage(items)+"]-----------");

                printItems(items, currentIndex, itemsToSkip);
                return;
            }
        }

    }

    private void printItems(LinkedList<T> items, int currentIndex, int itemsToSkip) {
        System.out.println("Items per page: " + itemsToSkip);
        for (int k = currentIndex; k < itemsToSkip; k++) {
            if (k < items.size()) {
                System.out.println(items.get(k));
            }
        }
    }

    @Override
    public LinkedList<T> getItems() {
        return items;
    }

    @Override
    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    private int getTotalItemsPerPage(LinkedList<T> items) {
        return (!items.isEmpty() && items.size() < itemsPerPage ? 1 :
                (int) Math.ceil((double) items.size() / itemsPerPage));
    }

    private int itemsToSkip(int currentPage) {
        return currentPage * itemsPerPage;
    }

    private int getCurrentIndex(int currentPage) {
        return (currentPage * itemsPerPage) - itemsPerPage;
    }

    private int getCurrentPage() {
        return currentPage;
    }

    private int setCurrentPage(int currentPage) {
        return this.currentPage = currentPage;
    }
}
