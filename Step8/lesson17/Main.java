package Step8.lesson17;

public class Main {
    public static void main(String[] args) {

        Bookshelf shelf = new Bookshelf();

        // ① Add books
        shelf.addBook(new Book("The Catcher in the Rye"));
        shelf.addBook(new Book("To Kill a Mockingbird"));
        shelf.addBook(new Book("1984"));
        shelf.addBook(new Book("Moby Dick"));

        // ② Normal iterator
        Iterator iterator = shelf.createIterator();

        System.out.println("Normal order:");
        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next().getTitle());
        }

        // ⭐ ③ HERE is your code (reverse iterator)
        System.out.println("\nReverse order:");

        Iterator reverse = new ReverseBookshelfIterator(shelf);

        while (reverse.hasNext()) {
            System.out.println("Book: " + reverse.next().getTitle());
        }
    }
}