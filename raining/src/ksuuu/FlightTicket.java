package ksuuu;

import java.util.Scanner; //import Scanner Library.

class FlightTicket {
	// Attributes:
	private static int numOfTickets;
	private String passengerName;
	private String ticketId;
	private char classType;
	private int daysBeforeFlight;

	// Parameterized Constructor
	public FlightTicket(String passengerName, char classType, int daysBeforeFlight) {
		this.passengerName = passengerName;
		this.classType = Character.toUpperCase(classType);
		this.daysBeforeFlight = daysBeforeFlight;
		this.ticketId = this.generateTicketID();
		numOfTickets++; // Increment the total count of tickets
	}

	// setters:
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

	// getters:
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

	// Generate the ticket ID
	private String generateTicketID() {
		String part = "";
		if (classType == 'f' || classType == 'F') {
			part = "FI";
		}
		if (classType == 'b' || classType == 'B') {
			part = "BU";
		}
		if (classType == 'e' || classType == 'E') {
			part = "EC";
		}
		String LastTwo;
		if (this.passengerName.length() >= 2) {
			LastTwo = this.passengerName.substring(this.passengerName.length() - 2).toUpperCase();
		} else {
			LastTwo = this.passengerName.toUpperCase();
		}

		return part + LastTwo + numOfTickets; // Concatenate all parts with the current number of tickets.
	}

	public double calculateTicketPrice() {
		if (classType == 'f' || classType == 'F') {
			return 2500 + (this.daysBeforeFlight * 20);
		} else if (classType == 'b' || classType == 'B') {
			return 1500 + (15 * this.daysBeforeFlight);
		} else if (classType == 'e' || classType == 'E') {
			return 850 + (10 * this.daysBeforeFlight);
		} else {
			return 0;
		}
	}

	// toString method
	public String toString() {
		return "passenger name: " + this.passengerName + ", ticket ID: " + this.ticketId + ", class type: "
				+ this.classType + ", days before flight: " + this.daysBeforeFlight + ", Total: "
				+ String.format("%.2f", this.calculateTicketPrice())+" SAR" + "\n============================";
	}
}
