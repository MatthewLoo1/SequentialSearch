
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
    for (Book childrensBook : childrensBooks) {
      if (childrensBook.getAuthor() == authorToFind) {
        System.out.println(childrensBook.getTitle());
      }
    }
  }
}