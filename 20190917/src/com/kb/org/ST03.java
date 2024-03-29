package com.kb.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST03")
public class ST03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ST03() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("get한글처리");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("aaa");
		
		String utfname = new String(name.getBytes("UTF-8"));
		String euckrname = new String(name.getBytes("euc-kr"));
		System.out.println("name = "+ name);
		System.out.println("utfname = "+ utfname);
		System.out.println("euckrname = "+ euckrname);

		PrintWriter out = response.getWriter();
		out.append("utf"+utfname);
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("한글넘어가라");
		out.println("name = "+name);
		out.println("utfname = "+utfname);
		out.println("euckrname = "+euckrname);
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post한글처리");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("aaa");
		String utfname = new String(name.getBytes("UTF-8"));
		String euckrname = new String(name.getBytes("euc-kr"));
		System.out.println("name = "+ name);
		System.out.println("utfname = "+ utfname);
		System.out.println("euckrname = "+ euckrname);

		PrintWriter out = response.getWriter();
		out.append("utf"+utfname);
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("한글넘어가라");
		out.println("name = "+name);
		out.println("utfname = "+utfname);
		out.println("euckrname = "+euckrname);
		out.println("</body>");
		out.println("</html>");
	}

}
