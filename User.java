public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void accessTicket(String ticketNumber, TicketingSystem ticketingSystem) {
        if (ticketingSystem.isTicketAvailable(ticketNumber)) {
            System.out.println(username + " is accessing ticket " + ticketNumber);
            ticketingSystem.reserveTicket(ticketNumber);
        } else {
            System.out.println("Error: Another user is accessing ticket " + ticketNumber);
        }
    }

    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();
        User user1 = new User("User1");
        User user2 = new User("User2");
        Admin admin = new Admin();

        // Simulating user accessing tickets
        user1.accessTicket("DE-1234", ticketingSystem);
        user2.accessTicket("DE-1234", ticketingSystem); // Should show error
        admin.accessTicket("DE-1234", "Admin"); // Admin accessing ticket
    }
}
