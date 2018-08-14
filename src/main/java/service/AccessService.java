
package service;

import dao.DAO;
import entitys.Access;
import java.util.List;

public class AccessService extends Service<Access>{
    
    public AccessService(DAO dao) {
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
    public void delete(Long id) {
        super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Access> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Access findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Access entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Access entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
