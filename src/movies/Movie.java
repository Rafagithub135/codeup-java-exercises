package movies;

public class Movie {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String category;

    public void setCategory(String category) {
        this.category = category;
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return name + " (" + category + ")";
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Godfather", "Drama");
        Movie movie2 = new Movie("The Godfather: Part II", "Drama");
        Movie movie3 = new Movie("The Dark Knight", "Action");
    }
}
