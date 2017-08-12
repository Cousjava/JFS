package com.sleightholme.jfs;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

import com.sleightholme.jfs.util.InvalidFileTypeException;

/**
 * 
 */

/**
 * @author jonathan coustick
 *
 */
public class JFSServlet extends ExtendedServlet {

	public void doHeader(String...imports){
		preHeader();
		printTitle();
		imports(imports);
		postHeader();
		
	}
	
	/**
	 * Imports CSS or Javascript to be added to the page
	 * No other filetypes can currently be imported
	 * @param imports
	 */
	protected void imports(String...imports){
		for (String imported : imports){
			if (imported.endsWith(".css")){
				out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"" +imported +"\">");
			} else if (imported.endsWith(".js")){
				 out.println("<script src=\"" + imported + "\"></script>"); 
			} else {
				throw new InvalidFileTypeException("Only .css or .js files can be imported");
			}
			
		}
	}
}
