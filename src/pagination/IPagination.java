package pagination;

import java.util.LinkedList;

public interface IPagination<T> {
    void add(T item);
    void first();
    void next();
    void previous();
    void last();
    void print(LinkedList<T> items, int currentPage);
    LinkedList<T> getItems();
    void setItemsPerPage(int itemsPerPage);
    //int getTotalItemsPerPage();
}
