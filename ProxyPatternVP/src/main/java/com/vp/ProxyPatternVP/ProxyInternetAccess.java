package com.vp.ProxyPatternVP;


public class ProxyInternetAccess implements OfficeInternetAccess {
	
	
		private String employeeName;
		
		private RealInternetAccess  realaccess;
		

		public ProxyInternetAccess(String employeeName) 
		{
			this.employeeName = employeeName;
		}
		
	
		@Override
		public void grantInternetAccess() 
		{
			if (getRole(employeeName) > 4) 
			{
				realaccess = new RealInternetAccess(employeeName);
				realaccess.grantInternetAccess();
			} 
			else 
			{
				System.out.println("No Internet access granted. Your job level is below 5");
			}

		}

		
		
		public int getRole(String emplName) {
			// Check role from the database based on Name and designation
			// return job level or job designation.
			// return 5; now change the job level
			
			if(emplName == "Isabel") {
				return 5;
			}
			else if(emplName == "Peter") {
				return 3;
			}
			else if(emplName == "John") {
				return 4;
			}
			else if(emplName == "Sarah") {
				return 3;
			}
			else {
				return 5;
			}
                                                   
		}


}
