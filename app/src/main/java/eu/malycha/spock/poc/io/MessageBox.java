package eu.malycha.spock.poc.io;

public class MessageBox {

    public void sendMessage(String message) {
        throw new UnsupportedOperationException("Message sending is currently unsupported.");
    }

    public String receiveMessage() {
        throw new UnsupportedOperationException("Message receive is currently unsupported.");
    }
}
