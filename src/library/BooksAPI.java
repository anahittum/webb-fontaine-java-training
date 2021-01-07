package library;

import java.time.LocalDate;

class BooksAPI {

    private BooksAPI() {
    }

    static Author[] getAuthors() {
        Author[] authors = new Author[7];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author(LibraryDataRepo.names[(i + 1) % 7],
                    LibraryDataRepo.surnames[(i + 1) % 7]);
            authors[i] = author;
        }
        return authors;
    }

    static Book[] getBooks(Author[] authors) {
        Book[] books = new Book[100];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book(LibraryDataRepo.titles[(i + 1) % 7],
                    authors[(int) (Math.random() * authors.length)],
                    createRandomDate(1900, 2000),
                    LibraryDataRepo.categories[(i + 1) % 7],
                    (float) Math.random() * 10);
            books[i] = book;
        }
        return books;
    }

    private static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomInt(1, 28);
        int month = createRandomInt(1, 12);
        int year = createRandomInt(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    private static int createRandomInt(int first, int second) {
        return first + (int) Math.round(Math.random() * (second - first));
    }

    private static int getMatchingAuthorsLength(Author[] authors, String input) {
        int length = 0;
        for (Author author : authors) {
            if (author.getName().contains(input) || author.getSurname().contains(input)) {
                length++;
            }
        }
        return length;
    }

    static Author[] getAuthorsMatchingTheInput(Author[] authors, String input) {
        Author[] matchingAuthors = new Author[getMatchingAuthorsLength(authors, input)];
        int j = 0;
        boolean isMatchFound = false;

        for (Author author : authors) {
            if ((author.getName().contains(input) || author.getSurname().contains(input))) {
                matchingAuthors[j] = author;
                j++;
                isMatchFound = true;
            }
        }
        if (!isMatchFound) {
            System.out.println("No matching authors");
        }
        return matchingAuthors;
    }
}
