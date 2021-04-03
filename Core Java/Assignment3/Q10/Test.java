package co.harsh.Assignment3.Q10;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Movie_DetailsList movieMaster = new Movie_DetailsList();

        movieMaster.add_movie(new Movie_Details("RA.ONE","Shahrukh Khan","Kareena Kapoor","Science Fiction"));
        movieMaster.add_movie(new Movie_Details("Rustom","Akshay Kumar","Ileana","Thriller"));
        movieMaster.add_movie(new Movie_Details("Ek Tha Tiger","Salman Khan","Katrina Kaif","Action"));
        movieMaster.add_movie(new Movie_Details("Singham","Ajay Devgan","Kareena Kapoor","Drama"));

        List<Movie_Details> list = movieMaster.find_movie_By_Genre("Drama");
         for(Movie_Details movie_details:list){
          //   System.out.println(movie_details);
         }

        //System.out.println(movieMaster.find_movie_By_mov_name("RA.ONE"));

//         movieMaster.remove_movie("RA.ONE");

         movieMaster.getMovieDetailsList().forEach(System.out::println);

         movieMaster.sortBasedOn("leadactor").forEach(System.out::println);

    }
}
