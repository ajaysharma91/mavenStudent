package restApp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import test.Address;
import test.AppUser;
import test.StudentDetails;
import test.Task;
import test.UserProfile;


@Path("/hello")
public class RestApiUser {

	@GET
	@Path("/getUser/{user_id}")
	public Response getMsg(@PathParam("user_id") Integer user_id) {

		Set<Address> address = new HashSet<Address>();
		List<String> emails = new ArrayList<String>();
		List<Task> task = new ArrayList<Task>();
        Date sdate  = new Date();
        Date udate  = new Date();
        Task task1 = new Task(1,"Lg",sdate,udate,"schedule");
        Task task2 = new Task(1,"web",sdate,udate,"complete");
        Task task3 = new Task(1,"jacks",sdate,udate,"Running");
		// this is the place where i create and add address
		Address home_address = new Address("Flat no 204", "electronic city", "bangalore", "electronic", "Karnataka", "india",
				"560092");
		Address office_address = new Address("Istar SKill develpment pvt ltd", "makam plaza", "bangalore",
				"Malleswaram", "Karnataka", "india", "560055");
		address.add(home_address);
		address.add(office_address);

		// this is where i create emails
        task.add(task1);
        task.add(task2);
        task.add(task3);
		emails.add("techintern3@istarindia.com");
		emails.add("techintern9@istarindia.com");
		UserProfile userProfile = new UserProfile(1, "harshitha devi", "female", "12345678", address, emails,task);
		AppUser appUser = new AppUser(user_id, "har123", "test123", userProfile);
		Gson gson = new Gson();
		System.out.println(gson.toJson(appUser));
		return Response.status(200).entity(gson.toJson(appUser)).build();

	}
	@POST
	@Path("/student/{stu_id}")
	public Response storeData(@PathParam("stu_id") Integer stu_id)
	{
		StudentDetails studentDetails = new StudentDetails(111,"Harshitha",2222,"11th");
		Gson gson = new Gson();
		System.out.println(gson.toJson(studentDetails));
		return Response.status(200).entity(gson.toJson(studentDetails)).build();
	}

}