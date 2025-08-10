class Movie {
    String title;
    String genre;
    double rating;

    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}

public class week2Q4 {
    public static void main(String[] args) {
        Movie m = new Movie("3 Idiots", "Comedy", 9.5);
        m.displayDetails();
    }
}