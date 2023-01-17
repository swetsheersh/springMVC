package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springmvc.controller.dao.UserDao;
import springmvc.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createuser(User user) {
		return this.userDao.insert(user);
	}
}
