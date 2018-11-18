/*******************
** John Gumm
** CIS 131
** Lab 8 
*******************/

public class Newsletter extends Publication {
    
    // Fields
    private String publicationFrequency;
    private String editor;
    private String owner;

    // No-arg constructor
    public Magazine() {
        setPublicationFrequency("");
        setEditor("");
        setOwner("");
    }

    // Constructor with args
    public Magazine(String publicationFrequency, String editor, String owner) {
        this.publicationFrequency = publicationFrequency;
        this.editor = editor;
        this.owner = owner;
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

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}