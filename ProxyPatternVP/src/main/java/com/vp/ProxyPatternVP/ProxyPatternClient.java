package com.vp.ProxyPatternVP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProxyPatternClient {
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		System.out.println("Please make your selection below:");
		System.out.println("=================================");
		System.out.println("1. Isabel ");
		System.out.println("2. Peter ");
		System.out.println("3. John ");
		System.out.println("4. Sarah ");
		System.out.println("5. Bob ");
		
		InputStreamReader r = new InputStreamReader(System.in);    
	    BufferedReader br = new BufferedReader(r);   
	    
	    int selection = Integer.parseInt(br.readLine());
	    String username;
	    
	    if(selection == 1) {
	    	username = "Isabel";
	    }
	    else if(selection == 2) {
	    	username = "Peter";
	    }
	    else if(selection == 3) {
	    	username = "John";
	    }
	    else if(selection == 4) {
	    	username = "Sarah";
	    }
	    else {
	    	username = "Bob";
	    }
	    
		OfficeInternetAccess access = new ProxyInternetAccess(username);
		
		access.grantInternetAccess();
	}


}
