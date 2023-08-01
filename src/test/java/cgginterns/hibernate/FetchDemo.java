package cgginterns.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		
		
		Session session= factory.openSession();
		
		Student s=(Student)session.get(Student.class,1);
		
		syso

	}

}
