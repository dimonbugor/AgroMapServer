
package service;

import dao.DAO;
import entitys.Tracker;
import java.util.List;


public class TrackerService extends Service<Tracker>{
    
    public TrackerService(DAO dao) {
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
    public List<Tracker> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tracker findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Tracker entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Tracker entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}
