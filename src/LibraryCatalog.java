import java.util.Iterator;

public class LibraryCatalog {

    public Books[] bookList;
    public int numberOfBooks;

    public LibraryCatalog() {
        this.bookList = new Books[3];
        this.numberOfBooks = 0;
    }

    public void addABook(Books book) {
        System.out.println();

        if (numberOfBooks <= bookList.length) {
            bookList[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println("The book " + book.name + " was added");
            System.out.println("There are currently " + numberOfBooks + " books in the catalogue");
        } else {
            System.out.println("Book cannot be added.");
        }

    }

    public void deleteABook(int indexToDelete) {
        System.out.println();


        if (indexToDelete < numberOfBooks && indexToDelete >= 0) {
            bookList[indexToDelete] = null;
            System.out.println("Book with number " + indexToDelete + " has just been deleted.");
            numberOfBooks--;
        } else {
            System.out.println("There is no such book in the library.");
        }

    }

    public void listBooks() {
        System.out.println("There are " + numberOfBooks + " book(s) in the catalogue now");
        for (Books book : bookList) {

            if (book != null) {
                if (book instanceof Novels) {
                    Novels novel = (Novels) book;
                    System.out.println("The book named " + novel.getName() + " has " + novel.getNumberOfPages() + " pages and the type: " + novel.getType());

                } else if (book instanceof ArtAlbums) {
                    ArtAlbums album = (ArtAlbums) book;
                    System.out.println("The book named " + album.getName() + " has " + album.getNumberOfPages() + " pages and the paper quality: " + album.getPaperQuality());

                }
            }

        }
    }


}
