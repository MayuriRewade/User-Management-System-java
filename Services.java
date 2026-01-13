package in.soft.services;

import in.soft.entity.User;

public interface Services {
	
	public String userInsert(User user);
	public User userSearch(Integer uid);
	public String userUpdate(User user);
	public String userDelete(Integer uid);


}
