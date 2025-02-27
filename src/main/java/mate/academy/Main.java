package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        // Add test
        Movie movie = new Movie();
        movie.setTitle("Terminator 2");
        movie.setDescription("Judgment Day");
        System.out.println(movieService.add(movie));

        // Get test
        System.out.println(movieService.get(1L));
    }
}
