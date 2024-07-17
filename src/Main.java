public class Main {
    public static void main(String[] args) {
        LibraryCatalog bookCollection = new LibraryCatalog();

        //adauga carti
        bookCollection.addABook(new Novels("Purple Hibiscus", 150, "Fiction"));
        bookCollection.addABook(new ArtAlbums("Urbanism", 100, "Glossy"));
        bookCollection.addABook(new Novels("Retroversiuni", 180, "Short stories"));

        //listeaza cartile
        System.out.println();
        System.out.println("These are the books available in the library: ");
        bookCollection.listBooks();

        //sterge cartea 0
        bookCollection.deleteABook(0);

        //listeaza din nou cartile
        System.out.println("Below is the modified catalogue");
        bookCollection.listBooks();

//        //adauda din nou cartea 0
//        bookCollection.addABook(new Novels("Purple Hibiscus", 150, "Fiction"));
//
//        //listeaza din nou cartile
//        System.out.println("Modified list of books: ");
//        bookCollection.listBooks();

        //sterge cartea 4
        bookCollection.deleteABook(4);


    }
}
