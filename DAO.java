package in.soft.dao;

import in.soft.entity.User;

public interface DAO {
	
	public String userInsert(User user);
	public User userSearch(Integer uid);
	public String userUpdate(User user);
	public String userDelete(Integer uid);

}
