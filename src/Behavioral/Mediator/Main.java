package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new Alice(chatRoom);
        User bob = new Bob(chatRoom);
        User charlie = new Charlie(chatRoom);

        alice.sendMessage("Hello everyone!");
        bob.sendMessage("Hi Alice! How are you?");
        charlie.sendMessage("Good morning all!");
    }
}
