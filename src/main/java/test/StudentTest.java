package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StudentTest {
	
	
	 
	
	    public static void main(String[] args) {
	 
	    	 Configuration cfg = new Configuration();
		        cfg.configure("hibernate.cfg.xml");
		 
		        SessionFactory factory = cfg.buildSessionFactory();
		        Session session = factory.openSession();
	         StudentDetails student = new StudentDetails(1,"Harshitha",111,"11th");
	        
	 
	        Transaction tx = session.beginTransaction();
	        session.save(student);
	        System.out.println("Object saved successfully.....!!");
	        tx.commit();
	        session.close();
	 
	}

}
