package Buffer;

import java.util.Scanner;

public class Representation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != 0) {
		System.out.println("What to do?");
		System.out.println("1.Tourist Places\n2.Popular Destinations\n3.Weather App\n4.Avaliable Tours and Travels\n5.Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			CityList cities = new CityList();
			cities.main(args);
			n = 1;
			break;
		case 2:
			CountryStateCityTree countrySearch = new CountryStateCityTree();
			countrySearch.main(args);
			n = 1;
			break;
		case 3:
			WeatherApp weather = new WeatherApp();
			weather.main(args);
			n=1;
			break;
		case 4:
			ToursAndTravels travel = new ToursAndTravels();
			travel.main(args);
			n=1;
			break;
		case 5:
			System.out.println("Exiting....");
			n=0;
			break;
		default:
			System.out.println("Invalid Input");
			n=1;
			break;
		}
		
	}

}
}