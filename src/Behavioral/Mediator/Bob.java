package Behavioral.Mediator;

public class Bob implements User {
    private String name;
    private ChatRoom chatRoom;

    public Bob(ChatRoom chatRoom) {
        this.name = "Bob";
        this.chatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " is sending a message: " + message);
        chatRoom.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
