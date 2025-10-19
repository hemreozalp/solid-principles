package service;

import persistence.Database;

public class UserService {
    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void addUser(String user) {
        database.save(user);
    }
}