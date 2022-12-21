package HomeWorkObjectsСlasses;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorFamily;

    public Author(String authorName, String authorFamily) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }
    public String getAuthorName() {

        return this.authorName;
    }
    public String getAuthorFamily() {

        return this.authorFamily;
    }
    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorFamily='" + authorFamily + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorFamily.equals(author.authorFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorFamily);
    }
}





