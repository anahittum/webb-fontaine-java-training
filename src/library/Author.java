package library;

public class Author {

    private String name;
    private String surname;

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        Author author = (Author) o;
        return name.equals(author.name) &&
                surname.equals(author.surname);
    }

    @Override
    public String toString() {
        return String.format("{ name: %s,surname: %s}", name, surname);
    }

}
