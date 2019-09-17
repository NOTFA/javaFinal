package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public join() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String gen = request.getParameter("gen");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String password_check = request.getParameter("password_check");
		String addr = request.getParameter("addr");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String[] hobby = request.getParameterValues("hobby");

		PrintWriter out = response.getWriter();

		if (password.equals(password_check)) {
			out.println("<h2>작성하신 내용은 아래와 같습니다.</h2><br>");
			out.println("이름 : " + name + "<br><hr/>");
			out.println("성별 : " + gen + "<br><hr/>");
			out.println("아이디 : " + id + "<br><hr/>");
			out.println("주소 : " + addr + "<br><hr/>");
			out.println("전화번호 : " + phone + "<br><hr/>");
			out.println("이메일 주소 : " + mail + "<br><hr/>");
			out.println("취미<br><br>");
			out.println(" <html>");
			out.println(" <body>");
			if (hobby == null) {
				out.println("[선택한 취미가 없습니다]");
			} else {
				out.println("<table border=\"1\">");
				for (int i = 0; i < hobby.length; i++) {
					out.println(" <tr>");
					out.println(" <td width=\"80\" align=\"center\">");
					out.println(hobby[i]);
					out.println(" </td>");
					out.println(" </tr>");
				}
			}
			out.println(" </table>");
			out.println(" </body>");
			out.println(" <html>");
		} else {
			out.println("<h2>아이디나 비밀번호가 일치하지 않습니다.</h2>");
		}
	}
}
