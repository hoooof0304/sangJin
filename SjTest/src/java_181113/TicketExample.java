package java_181113;

public class TicketExample {

	public static void main(String[] args) {
		
		AdvancedTicket AT = new AdvancedTicket(5000000,121315);
		WalkUpTicket WT = new WalkUpTicket(200000,111222333);
		
			AT.puchaseDate(5);
			WT.puchaseType(true);
		
		System.out.println("사전예약티켓의 티켓번호 : " + AT.ticketNum);
		System.out.println("사전예약티켓의 티켓가격 : " + AT.ticketPrice);
		System.out.println("일반예매티켓의 티켓번호 : " + WT.ticketNum);
		System.out.println("일반예매티켓의 티켓가격 : " + WT.ticketPrice);
		

	}

}
