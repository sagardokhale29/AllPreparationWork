/**
 * 
 */
package com.pamu.jms.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pamu.jms.publish.Publisher;

/**
 * @author pamuleti.pullagura
 *
 */
public class IBMMQPublishServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Publisher.xml");
		Publisher publish = (Publisher) context.getBean("publisher");
		String message = "My name is Khan";
		publish.sendMessage(message);
		System.out.println("Message sent to Topic");
	}
}
