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
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.SessionAwareMessageListener;

public class SubscriberOne implements MessageListener{


    public void processMessage(Message message) throws JMSException {
    	System.out.println("One Test");
        if (message instanceof TextMessage) {
            System.out.println("SubscriberOne recieved message : " + ((TextMessage) message).getText());
        }
    }

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		System.out.println("One Test");
        if (arg0 instanceof TextMessage) {
            try {
				System.out.println("SubscriberOne recieved message : " + ((TextMessage) arg0).getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
