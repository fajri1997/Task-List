import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Step 1: Create a List to hold your favorite songs/books/movies.

        String[] favorite_movies = {"the dark knight", "The Godfather", "Forrest Gump", "Interstellar", "Toy Story"};
        List<String> favorite_movies2 = new ArrayList<>(List.of("the dark knight", "The Godfather", "Forrest Gump", "Interstellar", "Toy Story"));

        favorite_movies2.remove(2);
        System.out.println(favorite_movies2);


        System.out.println("################################");
        for (String item : favorite_movies2) {
            System.out.println(item);
        }
        System.out.println("###############################");
        for (int i = 0; i < 5; i++) {
            System.out.println(favorite_movies2.get(i));
        }
//        favorite_movies.add("the dark knight");
//        favorite_movies.add("The Godfather");
//        favorite_movies.add("Forrest Gump");
//        favorite_movies.add("Interstellar");
//        favorite_movies.add("Toy Story");



    }
}