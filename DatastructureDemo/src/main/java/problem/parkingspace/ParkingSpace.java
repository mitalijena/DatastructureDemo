package problem.parkingspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ParkingSpace {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter wr = new PrintWriter(System.out);
		//int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[2][2];
		String[] parkingStartEndTimes = {"4:5","7:8"};//br.readLine().split(" ");
		for(int i=0;i<2;i++) {
			//String[] parkingStartEndtime = parkingStartEndTimes[i].split(",");
			for(int j = 0;j< parkingStartEndTimes.length;j++) {
				String[] parkingStartEndtimeArr = parkingStartEndTimes[i].split(":");
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndtimeArr[j]);
			}
		}
		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);
		//wr.close();
		//br.close();
	}

	public static int minParkingSpaces(int[][] parkingStartEndTimeList) {
		for(int i=0;i<parkingStartEndTimeList.length;i++) {
			for(int j= 0;j<i+1;i++) {
				int startTime = parkingStartEndTimeList[i][j];
			}
		}
		return 0;
		
	}
}
