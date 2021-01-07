package library;

public class BooksDemo {
    public static void main(String[] args) {

       Author[] authors = BooksAPI.getAuthors();
        LibraryDataRepo.ArrayToString(authors);

        Book[] books = BooksAPI.getBooks(authors);
        LibraryDataRepo.ArrayToString(books);


        Author[] matchingAuthors = BooksAPI.getAuthorsMatchingTheInput(authors, "name1");
        LibraryDataRepo.ArrayToString(matchingAuthors);
    }
}