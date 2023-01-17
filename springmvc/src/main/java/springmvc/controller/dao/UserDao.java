package springmvc.controller.dao;

import java.util.List;

import springmvc.model.User;

public interface UserDao {
	public int insert(User user);
	//get the single data(object)
	public User fetchfromtable(int id);
	//get all data
	public List<User> getallfromtable();
	//delete from table
	public void delfromtable(int id);
	//update
	public void updatetable(User user);
	
}
