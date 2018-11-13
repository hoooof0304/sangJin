package java_181113;

public class WalkUpTicket extends Ticket {
	boolean card = true;

	public WalkUpTicket(int ticketPrice, int ticketNum) {
		super(ticketPrice, ticketNum);
		

	}
	
	public boolean isCard() {
		return card;
	}

	public void setCard(boolean card) {
		this.card = card;
	}

	public int puchaseType(boolean card) {

		if (card = true) {
			ticketPrice = (int) (ticketPrice + (ticketPrice * 0.05));
			this.card = card;
		}
		return ticketPrice;

	}

	
}
