package moviedetails.co.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//MovieDetailsList class.
public class MovieDetailsList {

	// Creating arraylist
	static List<MovieDetails> movie = new ArrayList<>();

	// Method to add Movie.
	public static void addMovie() {
		movie.add(new MovieDetails("TZH", "Salman Khan", "Katrina Kaif", "Thriller"));
		movie.add(new MovieDetails("YJHD", "Ranbir Kapoor", "Deepika Padukone", "Romance"));
		movie.add(new MovieDetails("MSD: The Untold Story", "Sushant Singh Rajput", "Disha Patani", "Biopic"));
		movie.add(new MovieDetails("Ramleela", "Ranveer Singh", "Deepika Padukone", "Drama"));
		movie.add(new MovieDetails("1920 London", "Sharman Joshi", "Meera Chopra", "Horror"));
	}

	// Method to remove movie.
	public static void removeMovie(String movieToRemove) {

		MovieDetails movie2 = null;
		for (MovieDetails movie1 : movie) {

			if (movie1.getMovName().equalsIgnoreCase(movieToRemove))
				movie2 = movie1;
		}
		movie.remove(movie2);

	}

	// Method to remove all movies.
	public static void removeAllMovies() {

		movie.clear();
		System.out.println("All movies are deleted");
	}

	// Method to find movie by movie name.
	public static MovieDetails findMovieByMovName(String movieName) {

		for (MovieDetails movie1 : movie) {
			if (movie1.getMovName().equalsIgnoreCase(movieName))
				return movie1;
		}
		return null;
	}

	// Method to find movie by genre.
	public static List<MovieDetails> findMovieByGenre(String genre) {
		List<MovieDetails> moviegenre = new ArrayList<MovieDetails>();
		for (MovieDetails movie1 : movie) {
			if (movie1.getGenre() == genre)
				moviegenre.add(movie1);
		}
		return moviegenre;
	}

}
