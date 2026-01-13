package in.soft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.soft.entity.User;
import in.soft.factory.ServicesFactory;
import in.soft.services.Services;

public class ServeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		Services service = ServicesFactory.getService();

		String st_label = request.getParameter("register");

		if (st_label.equals("insert")) {

			user.setUid(Integer.parseInt(request.getParameter("uid")));
			user.setUname(request.getParameter("uname"));
			user.setUsal(Float.parseFloat(request.getParameter("usal")));
			user.setUloc(request.getParameter("uloc"));
			user.setUdes(request.getParameter("udes"));
			
			insert.
		}
		else {
			
		}

	}

}
