package cjava.examples.com.factory;

import cjava.examples.com.dao.ArticuloDAO;
import cjava.examples.com.dao.PersonaDAO;
import cjava.examples.com.interfaces.ArticuloInterfaces;
import cjava.examples.com.interfaces.PersonaInterface;

public class DAOFactory {
    public static DAOFactory getInstance(){
        return DAOFactoryHolder.INSTANCE;
    }
    private static class DAOFactoryHolder{
        private static final DAOFactory INSTANCE = new DAOFactory();
    }
    public PersonaInterface getPersonaDAO(int tipo){
        PersonaInterface dao=null;
        if(tipo == 1) dao = new PersonaDAO();
        //if(tipo == 2) dao = new PersonaDAOSQL();
        //if(tipo == 3) dao = new PersonaDAOMemoria();
        return dao;
    }
    
    public ArticuloInterfaces getArticuloDAO(){
        return new ArticuloDAO();
    }
}
