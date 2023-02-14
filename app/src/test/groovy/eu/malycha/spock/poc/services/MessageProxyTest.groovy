package eu.malycha.spock.poc.services

import eu.malycha.spock.poc.io.MessageBox
import spock.lang.Specification

class MessageProxyTest extends Specification {

    def "message is forwarded to send channel"() {
        given:
            def messageBox = Mock(MessageBox)
            def messageProxy = new MessageProxy(messageBox)
            messageBox.receiveMessage() >>> ["Mock message 1", "Mock message 2"]

        when:
            messageProxy.proxy()

        then:
            1 * messageBox.sendMessage("Mock message 1")
    }

}
