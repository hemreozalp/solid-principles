import persistence.Database;
import persistence.MySQLDatabase;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();

        UserService service = new UserService(db);
        service.addUser("Emre");
    }
}