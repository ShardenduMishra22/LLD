// DVD.java - Inherits from Item and adheres to LSP and OCP
public class DVD extends Item {
    private String director;

    public DVD(String title, String id, String director) {
        super(title, id);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public double getValue() {
        return 25.0; // Example fixed value for DVDs
    }
}
