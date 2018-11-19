/*******************
** John Gumm
** CIS 131
** Lab 8 
*******************/
import java.util.*;

public class MainDriver {

    public static void main(String args[]) {
        
        // Create arraylist for objects of publication supertype
        ArrayList<Publication> publications = new ArrayList<Publication>();

        // Instantiate 3 Book objects
        Book book1 = new Book(1232234564934L, 2008293847L, "Jerry Awles", 12, 2008, 2);
        book1.setTitle("Making a Book Title");
        book1.setPublisher("Jay's Publishing");
        book1.setPublicationDate("October 2002");
        book1.setSubject("Instructional");

        Book book2 = new Book(2738473837483L, 2012123345L, "Jimmy Jones", 365, 2016, 5);
        book2.setTitle("Great Book");
        book2.setPublisher("Jay's Publishing");
        book2.setPublicationDate("January 2012");
        book2.setSubject("Fiction");

        Book book3 = new Book(3748728348934L, 2002022032L, "Alan Landlan", 40, 2002, 1);
        book3.setTitle("The Snail");
        book3.setPublisher("Jay's Publishing");
        book3.setPublicationDate("October 2008");
        book3.setSubject("Fiction");


        // Instantiate 3 Magazine objects
        Magazine magazine1 = new Magazine("Weekly", "James Jeffries");
        magazine1.setTitle("Car Magazine");
        magazine1.setPublisher("Jay's Publishing");
        magazine1.setPublicationDate("October 1, 2018");
        magazine1.setSubject("Hobbies");

        Magazine magazine2 = new Magazine("Monthly", "January Christmason");
        magazine2.setTitle("World of Cups");
        magazine2.setPublisher("Jerry's Publishing");
        magazine2.setPublicationDate("December 1, 2012");
        magazine2.setSubject("Hobbies");

        Magazine magazine3 = new Magazine("Weekly", "Jan Bran");
        magazine3.setTitle("Robot Wives");
        magazine3.setPublisher("Tony's Publishing");
        magazine3.setPublicationDate("May 1, 2018");
        magazine3.setSubject("Hobbies");

        // Instantiate 3 Newsletter objects
        Newsletter newsletter1 = new Newsletter("Yearly", "Tim Tathom", "NewsWorld");
        newsletter1.setTitle("Car newsletter");
        newsletter1.setPublisher("Matt's Publishing");
        newsletter1.setPublicationDate("October 1, 2018");
        newsletter1.setSubject("News");

        Newsletter newsletter2 = new Newsletter("Daily", "Matt Christoff", "SeaWorld");
        newsletter2.setTitle("Ocean newsletter");
        newsletter2.setPublisher("SeaWorld");
        newsletter2.setPublicationDate("November 1, 2011");
        newsletter2.setSubject("News");

        Newsletter newsletter3 = new Newsletter("Weekly", "Jim Jam", "WorldWorld");
        newsletter3.setTitle("World News");
        newsletter3.setPublisher("WorldWorld");
        newsletter3.setPublicationDate("December 1, 2018");
        newsletter3.setSubject("News");

        // Add objects to arrayList
        publications.add(book1);
        publications.add(book2);
        publications.add(book3);
        publications.add(magazine1);
        publications.add(magazine2);
        publications.add(magazine3);
        publications.add(newsletter1);
        publications.add(newsletter2);
        publications.add(newsletter3);

        // Print toStrings of all objects in arraylist
        for (Publication pub: publications)
		{
			System.out.println(pub.toString() + "\n") ;
		}
    }

}