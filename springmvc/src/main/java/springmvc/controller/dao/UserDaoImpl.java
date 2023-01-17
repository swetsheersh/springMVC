package springmvc.controller.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional //change to write mode
	public int insert(User user) {
		//insert
		Integer i=(Integer)this.hibernateTemplate.save(user);
		return i;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public User fetchfromtable(int id) {
		User user= this.hibernateTemplate.get(User.class, id);
		return user;
	}
	public List<User> getallfromtable() {
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		return users;
	}
	@Transactional
	public void delfromtable(int id) {
		User user=this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(user);
	}
	@Transactional
	public void updatetable(User user) {
		// update
		this.hibernateTemplate.update(user);
	}

}
