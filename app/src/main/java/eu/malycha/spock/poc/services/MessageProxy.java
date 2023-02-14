package eu.malycha.spock.poc.services;

import eu.malycha.spock.poc.io.MessageBox;

public class MessageProxy {

    private MessageBox messageBox;

    public MessageProxy(MessageBox messageBox) {
        this.messageBox = messageBox;
    }

    public void proxy() {
        String msg = this.messageBox.receiveMessage();
        this.messageBox.sendMessage(msg);
    }
}
