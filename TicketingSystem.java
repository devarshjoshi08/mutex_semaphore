import java.util.HashMap;
import java.util.Map;

public class TicketingSystem {
    private Map<String, Boolean> tickets; // Ticket availability status
    public TicketingSystem() {
        this.tickets = new HashMap<>();
        tickets.put("DE-1234", true);
        tickets.put("MS-1234", true);
        tickets.put("PSE-1234", true);

        new Admin();
    }

    public boolean isTicketAvailable(String ticketNumber) {
        return tickets.containsKey(ticketNumber) && tickets.get(ticketNumber);
    }

    public void reserveTicket(String ticketNumber) {
        if (tickets.containsKey(ticketNumber)) {
            tickets.put(ticketNumber, false); // Mark ticket as reserved
        }
    }

    public void releaseTicket(String ticketNumber) {
        if (tickets.containsKey(ticketNumber)) {
            tickets.put(ticketNumber, true); // Mark ticket as available
        }
    }
}
