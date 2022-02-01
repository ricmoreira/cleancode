package beforerefactor;

import java.util.ArrayList;

public class Refactor2 {

    private class Book {} // ignore warnings. don't change here

    private class Author {} // ignore warnings. don't change here

    private class Publisher{} // ignore warnings. don't change here

    public ArrayList<Book> getBooks() {
        // ... going to the db and retrieving the books
        return new ArrayList<Book>();
    }

    public ArrayList<Author> fetchAuthors() {
        // ... going to the db and retrieving the authors
        return new ArrayList<Author>();
    }

    public ArrayList<Publisher> getPublishers() {
        // ... going to the db and retrieving the publishers
        return new ArrayList<Publisher>();
    }
}


// hint: intention-revealing names