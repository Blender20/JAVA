import java.util.ArrayList;

public class Program
{
    public MovieList movieList;
    
    public HorrorMovieList horrorMovieList;

    public Program()
    {
        movieList = new MovieList();
        horrorMovieList = new HorrorMovieList();
    }
    public static void main(String[] args)
    {
        Program program=new Program();
        
        program.movieList.movies.add("Friday");
        program.movieList.movies.add("Avatar");
        program.movieList.movies.add("Dodgeball");
        program.movieList.movies.add("Marvel");
        program.movieList.movies.add("Step Brothers");



        ArrayList<String> horrorMovies = program.horrorMovieList.getMovies();
        horrorMovies.add("The Ring");
        horrorMovies.add("The Ring2");
        horrorMovies.add("The Ring3");
        horrorMovies.add("The Ring4");
        horrorMovies.add("The Ring5");

        ArrayList<String> horrorMovies2 = program.horrorMovieList.getMovies();
        for(String movie:horrorMovies2)
        {
            System.out.println(movie);
        }
    }
};