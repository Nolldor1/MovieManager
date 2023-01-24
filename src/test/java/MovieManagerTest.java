import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {
    @Test
    public void shouldFindAllMovies() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";
        String film11 = "Movie 11";

        MovieManager manager = new MovieManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithLimit() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";
        String film11 = "Movie 11";

        MovieManager manager = new MovieManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findLast(5);
        String[] expected = {film11, film10, film9, film8, film7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithoutLimit() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";
        String film11 = "Movie 11";

        MovieManager manager = new MovieManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] actual = manager.findLast(10);
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastNoFilms() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";
        String film11 = "Movie 11";

        MovieManager manager = new MovieManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] actual = manager.findLast(0);
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}

