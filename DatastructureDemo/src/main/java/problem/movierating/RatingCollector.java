package problem.movierating;

public interface RatingCollector {
	void putNewRating(String movie, double rating);
	double getAverageRating(String movie);
	int getRatingCount(String movie);
}
