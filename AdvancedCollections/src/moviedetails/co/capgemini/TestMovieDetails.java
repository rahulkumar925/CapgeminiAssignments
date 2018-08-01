package moviedetails.co.capgemini;

//Test class.
public class TestMovieDetails {

	public static void main(String[] args) {
		// Calling method addMOvie.
		MovieDetailsList.addMovie();
		System.out.println(MovieDetailsList.movie);

		// Calling method "removeMovie"
		MovieDetailsList.removeMovie("TZH");
		System.out.print("Movie Details after removing 'TZH': ");
		System.out.println(MovieDetailsList.movie);

		// Searching movie by movie name.
		if (MovieDetailsList.findMovieByMovName("1920 london") != null) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		// Searching movie by "genre".
		System.out.print("Movie of type 'Thriller': ");
		System.out.println(MovieDetailsList.findMovieByGenre("Thriller"));

		// Removing all movies in the list.
		System.out.print("Movie after removing all movies: ");
		MovieDetailsList.removeAllMovies();
		System.out.println(MovieDetailsList.movie);

	}

}
