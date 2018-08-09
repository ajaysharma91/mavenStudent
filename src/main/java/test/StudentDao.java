package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import util.HibernateUtil;

public class StudentDao {
			
	
	
	  public List<StudentDetails> getEmployees(){
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();   
	        Query query =  session.createQuery("from StudentDetails");
	        List<StudentDetails> employees =   query.list();
	        session.close();
	        return employees;
	    }
	  
	  public void addEmployee(StudentDetails bean){
	      
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();   
		   addEmployee(session,bean);        
	        
	        session.close();
	        
	    }
	    
	    private void addEmployee(Session session, StudentDetails bean){
	    	StudentDetails employee = new StudentDetails();
	        
	        employee.setName(bean.getName());
	        employee.setId(bean.getId());
	        employee.setClassName(bean.getClassName());
	        employee.setRollNo(bean.getRollNo());
	        
	        session.save(employee);
	    }
	    
}
