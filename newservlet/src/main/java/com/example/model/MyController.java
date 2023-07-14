package com.example.model;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("t1"));
		String name=request.getParameter("t2");
		int price=Integer.parseInt(request.getParameter("t3"));
		
		
		try { 
			
			File file=new File("src/main/java/Data.txt");
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter o=new BufferedWriter(fw);
			o.write(id);
			o.write(name);
            o.write(price);
            o.newLine();
            o.close();
            System.out.println("data added");
            
		}
			
            
            
            
		 catch (IOException e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
	}

}
