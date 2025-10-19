package srp;

public class EmailNotifier implements Notifier{
    @Override
    public void notify(String to, String message){
        System.out.println("[MAIL] To: " + to + " | " + message);
    }
}
