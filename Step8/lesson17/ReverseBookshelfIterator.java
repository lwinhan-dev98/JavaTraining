package Step8.lesson17;

public class ReverseBookshelfIterator implements Iterator {
    private Bookshelf bookshelf;
    private int index;

    public ReverseBookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = bookshelf.getSize() - 1; // 最後の本から開始
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        return bookshelf.getBookAt(index--);
    }
}

