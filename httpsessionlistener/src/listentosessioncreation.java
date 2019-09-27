

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class listentosessioncreation
 *
 */
public class listentosessioncreation implements HttpSessionListener {

    /**
     * Default constructor. 
     */
	public static int count;
    public listentosessioncreation() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	count--;
    	System.out.println("Session is destroyed "+count);
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	count++;
    	System.out.println("New session is created "+count);
    }
	
}
