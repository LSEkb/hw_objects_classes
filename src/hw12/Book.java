package hw12;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }


    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга " + bookName + ", " + authorName.toString() + ", год издания " + publishingYear;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return bookName.equals(book.bookName) && authorName.equals(book.authorName) && publishingYear == book.publishingYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, authorName, publishingYear);
    }
}
