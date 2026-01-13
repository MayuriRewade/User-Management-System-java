package in.soft.services;
import in.soft.dao.DAO;
import in.soft.entity.User;
import in.soft.factory.DaoFactory;

public class ServicesIMPL implements Services {
	
	DAO dao=DaoFactory.getDAO();

	@Override
	public String userInsert(User user) {
		String userInsert = dao.userInsert(user);
		return userInsert ;
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
