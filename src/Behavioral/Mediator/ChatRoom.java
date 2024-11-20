package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User sender, String message) {
        System.out.println(sender.getName() + " says: " + message);
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
