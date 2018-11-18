/*******************
** John Gumm
** CIS 131
** Lab 8 
*******************/

public class Magazine extends Publication {
    
    // Fields
    private String publicationFrequency;
    private String editor;

    // No-arg constructor
    public Magazine() {
        setPublicationFrequency("");
        setEditor("");
    }

    // Constructor with args
    public Magazine(String publicationFrequency, String editor) {
        this.publicationFrequency = publicationFrequency;
        this.editor = editor;
    }

    // Mutator and accessor functions
    public String getPublicationFrequency() {
        return this.publicationFrequency;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

}