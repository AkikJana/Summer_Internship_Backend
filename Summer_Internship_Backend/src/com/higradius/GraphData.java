package com.higradius;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GraphCompany
 */
@WebServlet("/GraphCompany")
public class GraphData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

// protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// // TODO Auto-generated method stub
//
//    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<GraphPOJO> heads = new ArrayList<GraphPOJO>();

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			response.setContentType("text/html;charset=UTF-8");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

			System.out.println("Connected");
			PreparedStatement pstmt = con.prepareStatement("SELECT business_code,  SUM(actual_open_amount)\r\n" + 
					"FROM customer_invoice\r\n" + 
					"GROUP BY business_code ORDER BY SUM(actual_open_amount) DESC\r\n" + 
					"LIMIT 10;");
			ResultSet rs = pstmt.executeQuery();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

			while (rs.next()) {
				GraphPOJO head = new GraphPOJO();
				head.setCustomer_name(rs.getString(1));
				head.setTotal_open_amount(rs.getFloat(2));
				
				heads.add(head);
			}
		} catch (Exception e2) {
			System.out.println(e2);
			e2.printStackTrace();
		}
		Gson gs = new Gson();
		ArrayList<String> a = new ArrayList<>();
		response.addHeader("access control allow origin", "http://localhost:3000/1705205");
		PrintWriter printWriter = response.getWriter();
		String userJSON = gs.toJson(heads);
		response.addHeader("access control allow origin", "http://localhost:3000/1705205");
		printWriter.write(userJSON);
		printWriter.close();

	}

}