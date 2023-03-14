import java.util.Objects;

public class Author {
    private String theFirstNameAuthor;
    private String theSecondNameAuthor;

    public Author(String theFirstNameAuthor, String theSecondNameAuthor) {
        this.theFirstNameAuthor = theFirstNameAuthor;
        this.theSecondNameAuthor = theSecondNameAuthor;
    }

    public String getTheFirstNameAuthor() {
        return this.theFirstNameAuthor;
    }

    public String getTheSecondNameAuthor() {
        return this.theSecondNameAuthor;
    }

    @Override
    public String toString() {
        return this.theFirstNameAuthor + " "+ this.theSecondNameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author theSecondAuthor = (Author) other;
        return theFirstNameAuthor.equals(theSecondAuthor.theFirstNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theFirstNameAuthor, theSecondNameAuthor);
    }
}
