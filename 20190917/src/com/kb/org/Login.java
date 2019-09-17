package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String id_Ck = "admin";
		String pw_Ck = "1234";

		PrintWriter out = response.getWriter();
		
		if (id.equals(id_Ck) && password.equals(pw_Ck)) {
			out.println("<h2>로그인을 환영합니다.</h2>");
		} else {
			out.println("<h2>아이디나 비밀번호가 일치하지 않습니다.</h2>");
		}
	}
}
