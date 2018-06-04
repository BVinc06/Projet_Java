package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Level;


public abstract class LevelDAO extends AbstractDAO {

    /** The sql level 1. */
    private static String sqlLevel1   = "{call Level1()}";
    
    /** The sql level 2. */
    private static String sqlLevel2   = "{call Level2()}";
    
    /** The sql level 3. */
    private static String sqlLevel3   = "{call Level3()}";
    
    /** The sql level 4. */
    private static String sqlLevel4   = "{call Level4()}";
    
    /** The sql level 5. */
    private static String sqlLevel5   = "{call Level5()}";
    
     /**
     * Gets the level 1.
     *
     * @return the map of the first level
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getLevel1() throws SQLException {
        ArrayList<Level> level1 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLevel1);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            while(result.next()){         
                for(int i = 1; i<=25;i++) {
                	//System.out.print(result.getObject(i)+"\t");
                	level1.add(new Level((int)result.getObject(i)));             	
                }
//                	System.out.println("");	
            }
//            for(int i = 0;i<level1.size();i++) {
//		        System.out.print("I = "+i+" ");
//		        System.out.println(level1.get(i).getList());
//	        }
            result.close();
        }
        return level1;
    }

    /**
     * Gets the level 2.
     *
     * @return the map of the second level
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getLevel2() throws SQLException {
        final ArrayList<Level> level2 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLevel2);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            while(result.next()){         
                for(int i = 1; i<=25;i++) {
                	//System.out.print(result.getObject(i)+"\t");
                	level2.add(new Level((int)result.getObject(i)));             	
                }
//                	System.out.println("");	
            }
//            for(int i = 0;i<level2.size();i++) {
//		        System.out.print("I = "+i+" ");
//		        System.out.println(level2.get(i).getList());
//	        }
            result.close();
        }
        return level2;
    }
    /**
     * Gets the level 3.
     *
     * @return the map of the third level
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getLevel3() throws SQLException {
        final ArrayList<Level> level3 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLevel3);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            while(result.next()){         
                for(int i = 1; i<=25;i++) {
                	//System.out.print(result.getObject(i)+"\t");
                	level3.add(new Level((int)result.getObject(i)));             	
                }
//                	System.out.println("");	
            }
//            for(int i = 0;i<level3.size();i++) {
//		        System.out.print("I = "+i+" ");
//		        System.out.println(level3.get(i).getList());
//	        }
            result.close();
        }
        return level3;
    }
    /**
     * Gets the level 4.
     *
     * @return the map of the fourth level
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getLevel4() throws SQLException {
        final ArrayList<Level> level4 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLevel4);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            while(result.next()){         
                for(int i = 1; i<=25;i++) {
                	//System.out.print(result.getObject(i)+"\t");
                	level4.add(new Level((int)result.getObject(i)));             	
                }
//                	System.out.println("");	
            }
//            for(int i = 0;i<level4.size();i++) {
//		        System.out.print("I = "+i+" ");
//		        System.out.println(level4.get(i).getList());
//	        }
            result.close();
        }
        return level4;
    }
    /**
     * Gets the level 5.
     *
     * @return the map of the fifth level
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getLevel5() throws SQLException {
        final ArrayList<Level> level5 = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlLevel5);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            while(result.next()){         
                for(int i = 1; i<=25;i++) {
                	//System.out.print(result.getObject(i)+"\t");
                	level5.add(new Level((int)result.getObject(i)));             	
                }
//                	System.out.println("");	
            }
//            for(int i = 0;i<level5.size();i++) {
//		        System.out.print("I = "+i+" ");
//		        System.out.println(level5.get(i).getList());
//	        }
            result.close();
        }
        return level5;
    }


}