package Buffer;

import java.util.*;

public class CityList {
	public static void main(String[] args) {
	
		HashSet<String> Maharashtra = new HashSet<String>();
		
		//Cities in Maharashtra
		//HashSet<String> Mumbai = new HashSet<String>(Arrays.asList("Marine Drive", "Gateway Of India", "Sidhdhi Vinayak", "Golden Pagoda", "Water Park"));
		//HashSet<String> Pune = new HashSet<String>(Arrays.asList("Dagdu Seth Temple", "MKSSS Cummins College", "Peshwa Park", "Shaniwar Wada", "Shivneri Fort"));
		//HashSet<String> Aurangabad = new HashSet<String>(Arrays.asList("Ajanta Caves", "Ellora Caves", "Bibi ka Maqbara", "Bhaadra Maruti Temple", "Grishneshwar Temple"));
		//HashSet<String> Nashik = new HashSet<String>(Arrays.asList("Saptshringi Temple", "Kalaram Temple", "Panchvati", "HAL", "Pandav Leni"));
		//HashSet<String> Kolhapur = new HashSet<String>(Arrays.asList("Mahalakshmi Temple", "Kopeshwar Temple", "Kopeshwar Temple", "Lankala Lake", "Maharaja Palace"));
		
		Maharashtra.add("Mumbai");
		Maharashtra.add("Pune");
		Maharashtra.add("Aurangabad");
		Maharashtra.add("Nashik");
		Maharashtra.add("Kolhapur");
			
		
		HashSet<String> MadhyaPradesh = new HashSet<String>();
		
		MadhyaPradesh.add("Indore");
		MadhyaPradesh.add("Bhopal");
		MadhyaPradesh.add("Gwalior");
		MadhyaPradesh.add("Khandwa");
		MadhyaPradesh.add("Dewas");
		
		
		System.out.println("Places you can visit in Maharashtra");
		for(Object i : Maharashtra) System.out.println(i);
		
		System.out.println("Places you can visit in Madhya Pradesh");
		for(Object i : MadhyaPradesh) System.out.println(i);
	
	}
		
		
}
