/**
 * 
 */
package com.pamu.jms.subscribe;

/**
 * @author pamuleti.pullagura
 *
 */
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.SessionAwareMessageListener;

public class SubscriberTwo  {
	
    
    public void processMessage(Message message) throws JMSException {
    	System.out.println("Two Test");
        if (message instanceof TextMessage) {
            System.out.println("SubscriberTwo recieved message : " + ((TextMessage) message).getText());
        }
    }
}
