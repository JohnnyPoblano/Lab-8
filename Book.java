/*******************
** John Gumm
** CIS 131
** Lab 8 
*******************/

public class Book extends Publication {
    
    // Fields
    private long isbn;
    private long libraryOfCongressNumber;
    private String author;
    private int numberOfPages;
    private int copyrightYear;
    private int edition;

    // No-arg constructor
    public Book() {
        setIsbn(0);
        setLibraryOfCongressNumber(0);
        setAuthor("");
        setNumberOfPages(0);
        setCopyrightYear(0);
        setEdition(0);
    }


    // Constructor with args
    public Book(long isbn, long libraryOfCongressNumber, String author, int numberOfPages, int copyrightYear, int edition) {
        this.isbn = isbn;
        this.libraryOfCongressNumber = libraryOfCongressNumber;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.copyrightYear = copyrightYear;
        this.edition = edition;
    }

    // Mutator and accessor functions
    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getLibraryOfCongressNumber() {
        return this.libraryOfCongressNumber;
    }

    public void setLibraryOfCongressNumber(long libraryOfCongressNumber) {
        this.libraryOfCongressNumber = libraryOfCongressNumber;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCopyrightYear() {
        return this.copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}