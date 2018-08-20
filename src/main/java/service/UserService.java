
package service;

import dao.DAO;
import dao.UserDao;
import entitys.User;
import java.util.List;


public class UserService extends Service<User>{
    
    public UserService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        super.deleteAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(Integer id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(User entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    public User findByLogin(String login){
        UserDao d = new UserDao();
        d.openSession();
        User user = (User) d.findByLogin(login);
        d.closeSession();
        return user;
    }        
}
