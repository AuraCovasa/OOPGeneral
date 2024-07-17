public class ArtAlbums extends Books {

    private String paperQuality;

    public ArtAlbums(String name, int numberOfPages,
                     String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;

    }
}
