package Behavioral.Mediator;

public class Charlie implements User {
    private String name;
    private ChatRoom chatRoom;

    public Charlie(ChatRoom chatRoom) {
        this.name = "Charlie";
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
