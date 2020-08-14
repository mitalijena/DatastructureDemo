package problem.movierating;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieRatings {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//int numLines = Integer.parseInt(scanner.nextLine());
		//int currentLine = 0;
		//while(currentLine++ < numLines) {
			final RatingCollector stats = new RatingCollectorImpl();
			final Set<String> movies = new TreeSet<>();
			String line = "ABC:3,xyz:8,ABC:8,pqr:9,rty:4,xyz:8,xyz:9,rty:0";//scanner.nextLine();//
			String[] inputs = line.split(",");
			for(int i=0;i<inputs.length;i++) {
				String[] tokens = inputs[i].split(":");
				final String symbol = tokens[0];
				movies.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				stats.putNewRating(symbol, price);
			}
			for(String movie : movies) {
				System.out.println("Movie :"+movie+" :Avg rating :"+stats.getAverageRating(movie)
				+":Rating count :"+stats.getRatingCount(movie));
			}
		//}
	}

}