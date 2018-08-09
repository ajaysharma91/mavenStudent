package restApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import test.StudentDao;
import test.StudentDetails;
@Path("/student")
public class RestStudentDetails {	
	    @GET
	    @Path("details")
	    @Produces("application/json")
	    public Response getEmployee() {
	    //	StudentDetails studentdetails = new StudentDetails();
		    StudentDao dao = new StudentDao();
		    List<StudentDetails> employees = dao.getEmployees();
	        Gson gson = new Gson();
	        System.out.println(gson.toJson(employees));
	        return Response.status(200).entity(gson.toJson(employees)).build();
	    }
	    
	    
	    
	    @POST
	    @Path("/create")
	    @Produces("application/json")
	    public Response addEmployee(StudentDetails emp){
	        emp.setName(emp.getName());
	        emp.setId(emp.getId());
	        emp.setClassName(emp.getClassName());
	        emp.setRollNo(emp.getRollNo());
	                
	        StudentDao dao = new StudentDao();
	        dao.addEmployee(emp);
	        
	        return Response.ok().build();
	    }

}
