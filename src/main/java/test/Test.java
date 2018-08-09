package test;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		List<StudentDetails> employees = dao.getEmployees();
		for (StudentDetails studentDetails : employees) {
			System.out.println("studentDetails " + studentDetails.getName());
		}
		System.out.println("done");
	}
}
