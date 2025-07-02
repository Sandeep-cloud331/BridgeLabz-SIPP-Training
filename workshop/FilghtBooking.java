import java.util.ArrayList;
class FlightBooking{
	static ArrayList<String> bookings = new ArrayList<>();
	static String[] flightTypes = new String[]{"First class","Economy","General"};
	public boolean searchFlight(String flightType){
		for(String type : flightTypes){
			if(type.toLowerCase().equals(flightType.toLowerCase())){
				return true;
			}
		}
		return false;
	}
	
	public String bookFlight(String flightType,String seatType){
		String[] seatTypes = new String[]{"Corner","Middle","Window"};
		boolean available = searchFlight(flightType);
		if(available){
			System.out.println("flight type is avilable");
			for(String type :seatTypes ){
				if(type.toLowerCase().equals(seatType.toLowerCase())){
					bookings.add(flightType+" "+seatType);
					return "Flight Booked";
				}
			}
		
		
		}
		return "Flight not available";
	}
	public String[] displayBookings(){
		return bookings.toArray(new String[0]);
	}
	public static void main(String[] args){
		FlightBooking flight = new FlightBooking();
		System.out.println(flight.displayBookings());
	}
}