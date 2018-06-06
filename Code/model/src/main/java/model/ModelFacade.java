package model;

import java.sql.SQLException;
import java.util.List;
import model.dao.ExampleDAO;
import model.dao.LevelDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
   
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
 
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

    public List<Level> getLevel1() throws SQLException {
        return LevelDAO.getLevel1();
    }
    
    public List<Level> getLevel2() throws SQLException {
        return LevelDAO.getLevel2();
    }
    public List<Level> getLevel3() throws SQLException {
        return LevelDAO.getLevel3();
    }
    public List<Level> getLevel4() throws SQLException {
        return LevelDAO.getLevel4();
    }
    public List<Level> getLevel5() throws SQLException {
        return LevelDAO.getLevel5();
    }
    
    
    
   
}