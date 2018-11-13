package java_181113;

public class AdvancedTicket extends Ticket{
	int AT_Date;
	
	public AdvancedTicket(int ticketPrice, int ticketNum) {
		super(ticketPrice, ticketNum);
		
			
	}
	
	public int getAT_Date() {
		return AT_Date;
	}

	public void setAT_Date(int aT_Date) {
		AT_Date = aT_Date;
	}
	
	public int puchaseDate(int AT_Date) {
		
		if(AT_Date > 10) {
			ticketPrice = ticketPrice/2;
			
		}else if(AT_Date > 5) {
			ticketPrice = ticketPrice*(1/5);
			
		}else {
			ticketPrice = (int) (ticketPrice-(ticketPrice*0.01));
		}
		return ticketPrice;
		
	}

	
}
