package in.soft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import in.soft.entity.User;
import in.soft.factory.ConnectionFactory;

public class DAOIMPL implements DAO{
	User user = new User();
	Connection con=ConnectionFactory.getConnection();
	@Override
	public String userInsert(User user) {
		
		int uid=user.getUid();
		String uname=user.getUname();
		Float usal=user.getUsal();
		String uloc=user.getUloc();
		String udes=user.getUdes();
		
		try {
			String sql="insert into user values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			boolean ex = ps.execute(sql);
			if(ex==true) {
				System.out.println("execute");
			}
			else {
				System.out.println("Not execute");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user inserted succesfully";
	}
	@Override
	public User userSearch(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String userUpdate(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String userDelete(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
