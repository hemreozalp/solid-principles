package persistence;

public class MongoDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }
}