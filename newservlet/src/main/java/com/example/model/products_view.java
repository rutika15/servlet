package com.example.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class products_view extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String filePath = "src/main/java/Data.txt"; // Path to your file
		ServletContext context=getServletContext();
		InputStream inp=context.getResourceAsStream(filePath);
		if(inp!=null)
		{
			InputStreamReader isr=new InputStreamReader(inp);
			BufferedReader reader=new BufferedReader(isr);
			PrintWriter pw=response.getWriter();
			pw.println("<html><head><title>Read text file</title></head></html>");
			String t="";
			while((t=reader.readLine())!=null)
			{
				pw.println(t);
			}
		}

//		try (FileInputStream fis = new FileInputStream(filePath);
//		     BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
//
//		    String line;
//		    while ((line = reader.readLine()) != null) {
//		        // Process each line of the file
//		        System.out.println(line);
//		    }
//
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}

}

}

