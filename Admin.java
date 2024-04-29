import java.util.concurrent.Semaphore;

public class Admin {
    private Semaphore semaphore;

    public Admin() {
        this.semaphore = new Semaphore(1); // Semaphore for admin
    }

    public void accessTicket(String ticketNumber, String currentUser) {
        try {
            semaphore.acquire();
            System.out.println("Admin " + currentUser + " is accessing ticket " + ticketNumber);
            // Logic to access the ticket
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
