import java.util.Objects;

public class Author {
    private final String firstMame;
    private final String secondName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstMame, author.firstMame) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstMame, secondName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstMame='" + firstMame + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Author(String firstMame, String secondName) {
        this.firstMame = firstMame;
        this.secondName = secondName;
    }

    public String getFirstMame() {
        return firstMame;
    }

    public String getSecondName() {
        return secondName;
    }


}
