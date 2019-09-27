import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class hqlApp {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		Configuration c=cfg.configure();
		SessionFactory f=c.buildSessionFactory();
		Session session=f.openSession();
		Transaction tr=session.beginTransaction();
		//Query query=session.createQuery("from Book");
		//Query query=session.createQuery("select b.book,b.price from Book b");
		//Query query=session.createQuery("from Book b where b.price>400");
		//Query query=session.createQuery("from Book b where b.price between 300 and 400");
		//Query query=session.createQuery("from Book b where b.book='c'");
		//Query query=session.createQuery("from Book b where b.author='jane'");
		//Query query=session.createQuery("from Book b where b.book like 'c%'");
		//Query query=session.createQuery("from Book b where b.author like 'j%'");
		//Query query=session.createQuery("from Book b order by b.price");
		//Query query=session.createQuery("from Book b order by b.author desc");
		//Query query=session.createQuery("select min(b.price) from Book b");
		//Query query=session.createQuery("select max(b.price) from Book b");
		//Query query=session.createQuery("select sum(b.price) from Book b");
		//Query query=session.createQuery("select avg(b.price) from Book b");
		//Query query=session.createQuery("select count(*) from Book b");
		//Query query=session.createQuery("select min(b.price) from Book b");
		Query query=session.createQuery("select count(*) from Book b where b.book='Wings Of Fire'");
		Object value=query.uniqueResult();
		System.out.println(value);
		/*List bookrecords=query.list();
		Iterator it=bookrecords.iterator();
		while(it.hasNext())
		{
			Book book=(Book) it.next();
			System.out.println(book);
			session.save(book);
			
		}*/
//		tr.commit();
		session.flush();
		session.close();
	}

}
