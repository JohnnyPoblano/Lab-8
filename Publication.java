/*******************
** John Gumm
** CIS 131
** Lab 8 
*******************/

public abstract class Publication {

    // Fields
    private String title;
    private String publisher;
    private String publicationDate;
    private String subject;

    // No-arg constructor
    public Publication() {
        setTitle("");
        setPublisher("");
        setPublicationDate("");
        setSubject("");
    }

    // Constructor with args
    public Publication(String title, String publisher, String publicationDate, String subject) {
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.subject = subject;
    }

    // Mutator and accessor functions
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuffer strBuf = new StringBuffer("\nPublication data: \n") ;
        strBuf.append("\nTitle              : " ); 
        strBuf.append(title);
        strBuf.append("\nPublisher          : " );
        strBuf.append(publisher); 
        strBuf.append("\nPublication Date   : "); 
        strBuf.append(publicationDate);
        strBuf.append("\nSubject            : ");
        strBuf.append(subject); 
        strBuf.append("\n");

        return strBuf.toString();
    }
}