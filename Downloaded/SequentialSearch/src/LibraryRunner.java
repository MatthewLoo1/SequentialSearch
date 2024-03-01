
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;

    for (Book childrensBook : childrensBooks) {
      if (childrensBook.getAuthor().equals(authorToFind)) {
        System.out.println(childrensBook.getTitle());
      }
      if (childrensBook.getTitle().equals(bookToFind)) {
          minimumRating = childrensBook.getRating();
          System.out.println("minimum changed");
        }
      if (childrensBook.getRating() >= 4.14) {
        System.out.println(childrensBook.getAuthor() + " - " + childrensBook.getTitle());
      } 
    }
    System.out.println("Sky Island Minimum Rating: " + minimumRating);
  }
}
