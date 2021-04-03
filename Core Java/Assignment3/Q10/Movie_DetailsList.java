package co.harsh.Assignment3.Q10;
/**
 * This class responsible for keeping track of
 * movie list,add new movie to the list,
 * remove from the list,etc.
 */

import java.util.*;

public class Movie_DetailsList {

    private List<Movie_Details> movieDetailsList ;

    /**
     * Create object of movielist
     */
    public Movie_DetailsList(){
        movieDetailsList = new ArrayList<>();
    }

    /**
     * add movie to the list
     * @param movie_details contains movie details
     */
    public void add_movie(Movie_Details movie_details){
        movieDetailsList.add(movie_details);
    }

    /**
     * remove movie from the current list
     * @param name of movie
     */
    public void remove_movie(String name){
        for(Movie_Details movie:movieDetailsList){
            if(movie.getMov_Name().equalsIgnoreCase(name)){
                movieDetailsList.remove(movie);
                break;
            }
        }
    }

    /**
     * remove all movies from the list
     */
    public void remove_allMovies(){
        movieDetailsList.removeAll(movieDetailsList);
    }

    /**
     * search for a movie based on movie
     * @param name is the name of the movie to be searched
     * @return object of movie_details
     */
    public Movie_Details find_movie_By_mov_name(String name){
        for(Movie_Details movie:movieDetailsList){
            if(movie.getMov_Name().equalsIgnoreCase(name))
                return movie;
        }
        return null;
    }

    /**
     * provide list of movie under specific genre
     * @param name is define the genre to be searched
     * @return list of movies under one genre
     */
    public List<Movie_Details> find_movie_By_Genre(String name){
        List<Movie_Details> genereWiseList = new ArrayList<>();
        for(Movie_Details movie:movieDetailsList){
            if(movie.getGenre().equalsIgnoreCase(name))
                genereWiseList.add(movie);
        }
        return genereWiseList;
    }

    /**
     * create a comparator object which
     * compare based on movie name
     */
    public static Comparator<Movie_Details> mov_NameComparator = new Comparator<Movie_Details>() {
        @Override
        public int compare(Movie_Details o1, Movie_Details o2) {
            String nameOfo1 = o1.getMov_Name();
            String nameOfo2 = o2.getMov_Name();

            return nameOfo1.compareTo(nameOfo2);
        }
    };

    /**
     * create a comparator based on
     * compare based on lead actor name
     */
    public static Comparator<Movie_Details> lead_actorComparator = new Comparator<Movie_Details>() {
        @Override
        public int compare(Movie_Details o1, Movie_Details o2) {
            String nameOfo1 = o1.getLead_actor();
            String nameOfo2 = o2.getLead_actor();

            return nameOfo1.compareTo(nameOfo2);
        }
    };


    /**
     * create a comparator based on
     * compare based on lead actoress name
     */

    public static Comparator<Movie_Details> lead_actoressComparator = new Comparator<Movie_Details>() {
        @Override
        public int compare(Movie_Details o1, Movie_Details o2) {
            String nameOfo1 = o1.getLead_actoress();
            String nameOfo2 = o2.getLead_actoress();

            return nameOfo1.compareTo(nameOfo2);
        }
    };


    /**
     * create a comparator based on
     * compare based on genre
     */
    public static Comparator<Movie_Details> genre_Comparator = new Comparator<Movie_Details>() {
        @Override
        public int compare(Movie_Details o1, Movie_Details o2) {
            String nameOfo1 = o1.getGenre();
            String nameOfo2 = o2.getGenre();

            return nameOfo1.compareTo(nameOfo2);
        }
    };


    public List<Movie_Details> getMovieDetailsList(){
        return movieDetailsList;
    }

    public List<Movie_Details> sortBasedOn(String type){
        if(type.equalsIgnoreCase("moviename")){
            Collections.sort(movieDetailsList,Movie_DetailsList.mov_NameComparator);
            return movieDetailsList;
        }
        else if(type.equalsIgnoreCase("genre")){
            Collections.sort(movieDetailsList,Movie_DetailsList.genre_Comparator);
            return movieDetailsList;
        }
        else if(type.equalsIgnoreCase("leadactor")){
            Collections.sort(movieDetailsList,Movie_DetailsList.lead_actorComparator);
            return movieDetailsList;
        }
        else if(type.equalsIgnoreCase("leadactoress")){
            Collections.sort(movieDetailsList,Movie_DetailsList.lead_actoressComparator);
            return movieDetailsList;
        }
        return movieDetailsList;
    }
}
