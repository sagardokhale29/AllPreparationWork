/**
 * 
 */
package com.pamu.jms.publish;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.ibm.mq.jms.MQTopic;

/**
 * @author pamuleti.pullagura
 *
 */
public class Publisher {
	
	private JmsTemplate jmsTemplate;
	private String defaultDestination;
	
	public String getDefaultDestination() {
		return defaultDestination;
	}

	public void setDefaultDestination(String defaultDestination) {
		this.defaultDestination = defaultDestination;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendMessage(String message) {
        sendMessage(defaultDestination, message);
    }
	
	public void sendMessage(String destination, final String message) {

		assert (destination != null);
		
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});

	}


}
