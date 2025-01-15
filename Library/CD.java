// CD.java - Inherits from Item and adheres to LSP and OCP
public class CD extends Item {
    private String artist;

    public CD(String title, String id, String artist) {
        super(title, id);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public double getValue() {
        return 15.0; // Example fixed value for CDs
    }
}
