import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int publishingYear;

    public Book(String nameBook, Author nameAuthor, int publishingYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.nameBook + ", " + this.nameAuthor + ", год издания: " + this.publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book theSecondBook = (Book) other;
        return Objects.equals(publishingYear, theSecondBook.publishingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthor, publishingYear);
    }
}
