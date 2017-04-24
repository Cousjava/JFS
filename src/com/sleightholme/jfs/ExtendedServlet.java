package com.sleightholme.jfs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jonathan coustick
 */
@WebServlet("/ExtendedServlet")
public class ExtendedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected PrintWriter out;
	protected String title = "";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExtendedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
	}
	
	/**
	 * Sets the title of the servlet
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * Gets the title of the servlet
	 * @return
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * Prints out the head including title of the HTML
	 */
	public void doHeader(){
		preHeader();
		printTitle();
		postHeader();
	}
	
	/**
	 * Prints out the opening html tags
	 */
	protected void preHeader(){
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
	}
	
	/**
	 * Prints out the title of the servlet
	 */
	protected void printTitle(){
		out.println("<title>" + title + "</title>");
	}
	
	/**
	 * Prints out the end of the head and the start of the body
	 */
	protected void postHeader(){
		out.println("</head>");
		out.println("<body>");
	}
	
	/**
	 * Prints out the end of body and html tags
	 */
	public void doFooter(){
		out.println("</body>");
		out.println("</html>");
	}

}
