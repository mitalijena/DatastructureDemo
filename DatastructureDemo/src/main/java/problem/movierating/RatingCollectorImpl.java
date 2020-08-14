package problem.movierating;

import java.util.HashMap;
import java.util.Map;

public class RatingCollectorImpl implements RatingCollector {
	
	Map<String, Map> movieMap =new HashMap<>();
	int numRatings = 0;
	double sumRatings = 0;
	Map movieRatingMap = new HashMap();
	public void putNewRating(String movie, double rating) {
		if(!movieMap.containsKey(movie)) {
			movieRatingMap = new HashMap();
			numRatings = 0;
			sumRatings = 0;
			numRatings++;
			sumRatings = sumRatings + rating;
			movieRatingMap.put(numRatings, sumRatings);
		} else {
			movieRatingMap = movieMap.get(movie);
			numRatings = (int) movieRatingMap.keySet().toArray()[0];
			sumRatings = (double) movieRatingMap.get(numRatings);
			numRatings++;
			sumRatings = sumRatings + rating;
			movieRatingMap.clear();
			movieRatingMap.put(numRatings, sumRatings);
		}
		movieMap.put(movie, movieRatingMap);
		System.out.println("MovieMap :"+movieMap.toString());
	}

	public double getAverageRating(String movie) {
		double avgRating = 0.0;
		if(movieMap.containsKey(movie)){
			Map map = movieMap.get(movie);
			numRatings = (int) map.keySet().toArray()[0];
			sumRatings = (double) map.get(numRatings);
			avgRating = sumRatings/numRatings;
		}
		return avgRating;
	}

	public int getRatingCount(String movie) {
		int count = 0;
		if(movieMap.containsKey(movie)){
			Map map = movieMap.get(movie);
			count = (int) map.keySet().toArray()[0];
		}
		return count;
	}

}
