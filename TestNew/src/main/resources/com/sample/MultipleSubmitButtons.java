package com.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleButtons
 */
public class MultipleButtons extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException   
	  {
	    res.setContentType( "text/html" ) ;
	    ServletOutputStream sos = res.getOutputStream(); // instead of PrintWriter
	 
	                                                // reading from text field
	    double radius =  Double.parseDouble(req.getParameter("rad"));   
	 
	  				                //  reading from submit buttons
	    String str1 = req.getParameter("a1");       //  AREA submit button
	    String str2 = req.getParameter("p1");       //  PERIMETER submit button
	    String str3 = req.getParameter("b1");		//EXIT submit button
	    //Comment added
	    sos.println("<h3>");
	 
	    if(str1 != null)                            // if AREA is clicked
	    {    
	      sos.println("You clicked " + str1 + " submit button<br>");
	      sos.println("Area is "+ Math.PI*radius*radius+"</h2>");
	    }			                         
	    else if(str2 != null)                       // if PERIMETER is clicked
	    { 
	      sos.println("You clicked " + str2 + " submit button<br>");
	      sos.println("<h2>Perimeter is "+ 2*Math.PI*radius+"</h2>")  ;                      
	    }
	    else if(str3 != null)
	    {
	    	sos.println("You clicked "+ str3 + " submit button<br>");
	    }
	 
	    sos.println("</h3>");
	    sos.close( );
	  }    
}
