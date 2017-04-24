package com.sleightholme.jfs;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

/**
 * 
 */

/**
 * @author jonathan coustick
 *
 */
public class JFSServlet extends ExtendedServlet {

	protected PrintWriter out;	
	protected String title = "";
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	/**
	 * Prints out the head including title of the HTML
	 */
	public void doHeader(){
		preHeader();
		out.println("<title>" + title + "</title>");
		postHeader();
	}
	
	/**
	 * Prints out the opening html tags
	 */
	protected void preHeader(){
		out.println("<html>");
		out.println("<head>");
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
