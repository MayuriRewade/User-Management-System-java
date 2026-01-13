package in.soft.factory;

import in.soft.dao.DAO;
import in.soft.dao.DAOIMPL;

public class DaoFactory {
	
 private static DAO dao=null;
	 
	 static {
		 dao= new DAOIMPL();
	 }
	 public static DAO getDAO() {
		 return dao;
	 }

}
