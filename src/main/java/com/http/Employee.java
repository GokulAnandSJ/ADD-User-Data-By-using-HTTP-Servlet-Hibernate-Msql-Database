package com.http;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Employee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		int empid =Integer.parseInt(req.getParameter("empId"));
		String empname =req.getParameter("empName");
		String empEmail = req.getParameter("empEmail");
		String address =req.getParameter("empAddress");


		EmployeeMain emp = new EmployeeMain();
		emp.setEmpId(empid);
		emp.setEmpName(empname);
		emp.setEmpEmail(empEmail);
		emp.setEmpAddress(address);


		Configuration cfg = new Configuration().configure().addAnnotatedClass(EmployeeMain.class);

		SessionFactory sf =cfg.buildSessionFactory();

		Session ses =sf.openSession();

		Transaction trns = ses.beginTransaction();

		ses.save(emp);
		trns.commit();
		ses.close();

		String message ="Data Inserted Sucessfully !!!!";

		req.setAttribute("m1", message);
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		rd.forward(req, resp);
	}

}
