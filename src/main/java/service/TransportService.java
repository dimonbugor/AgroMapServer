
package service;

import dao.DAO;
import entitys.Transport;
import java.util.List;

public class TransportService extends Service<Transport>{
    
    public TransportService(DAO dao) {
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
    public List<Transport> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transport findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Transport entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Transport entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
