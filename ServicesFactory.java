package in.soft.factory;

import in.soft.services.Services;
import in.soft.services.ServicesIMPL;

public class ServicesFactory {
	
static Services service=null;  
	
	static {						
		service = new ServicesIMPL();
	}
	public static Services getService() {
		return service;
	}


}
