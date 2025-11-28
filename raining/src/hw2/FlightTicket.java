package hw2;
import java.util.Scanner;
class FlightTicket {
	private static int numOfTickets;
	private String passengerName;
	private String ticketId;
	private char classType;
	private int daysBeforeFlight;
	
	public FlightTicket(String passengerName , char classType , int daysBeforeFlight) {
		this.passengerName = passengerName;
		this.classType = classType;
		this.daysBeforeFlight = daysBeforeFlight;
		this.ticketId = this.generateTicketID();
     	numOfTickets++;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public void setClassType(char classType) {
		this.classType = classType;
	}
	public void setDaysBeforeFlight(int daysBeforeFlight) {
		this.daysBeforeFlight = daysBeforeFlight;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public String getTicketId() {
		return ticketId;
	}
	public char getClassType() {
		return classType;
	}
	public int getDaysBeforeFlight() {
		return daysBeforeFlight;
	}
	private String generateTicketID() {
		String part = "";
		if(classType == 'f' || classType== 'F' ) {
			part = "Fi";
		}
		if(classType == 'b' || classType == 'B') {
			part = "BU";
		}
		if(classType == 'e' || classType == 'E') {
			part = "EC";
		}
		String LastTwo = this.passengerName.substring(this.passengerName.length()-2).toUpperCase();
		return part + LastTwo + numOfTickets;
	}
	public double calculateTicketPrice() {
		if(classType == 'f' || classType== 'F' ) {
			return 1200 + (this.daysBeforeFlight*20); 
		}
		else if(classType == 'b' || classType == 'B') {
			return 1500 + (15*this.daysBeforeFlight);
		}
		else if(classType == 'e' || classType == 'E') {
			return 850 + (10*this.daysBeforeFlight);
		}
		else {
			return 0;
		}
    }
	public String toString() {
		return "passenger name: " + this.passengerName +" ticket ID: "+this.ticketId + 
				" class type: "+this.classType + " days before flight: "+this.daysBeforeFlight +" Total price"+
				this.calculateTicketPrice();
	}
}	
	class FlightTicketDemo {
		public boolean isValidClassType(char type) {
			if(type == 'f' || type == 'F' || type =='b' || type == 'B' ||type =='E' || type == 'e') {
				return true;
			}
			else {
				return false;
			}
			
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter The passenger name (enter exit to stop) : ");
		    String name = input.nextLine();
			System.out.println("Enter The class type: ");
			String type = input.next();
			System.out.println("How many days are left until the flight? ");
			int daysBeforeFlight = input.nextInt();
			FlightTicketDemo demo = new FlightTicketDemo();
			char classType = type.charAt(0);
			boolean valid = demo.isValidClassType(classType);
			if(!valid) {
				System.out.println("Invalid class type!");
				System.exit(0);
			}
			else {
				System.out.println("valid class tpye");
			}
			FlightTicket t = new FlightTicket(name , classType , daysBeforeFlight);
			System.out.println(t.toString());
			
			
		
			
		}
	}
	

