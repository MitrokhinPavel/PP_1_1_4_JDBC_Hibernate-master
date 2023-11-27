package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Иван1", "Иванов1", (byte) 1);
        userService.saveUser("Иван2", "Иванов2", (byte) 2);
        userService.saveUser("Иван3", "Иванов3", (byte) 3);
        userService.saveUser("Иван4", "Иванов4", (byte) 4);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        userService.removeUserById(3);



    }
}