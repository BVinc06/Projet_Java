package model;



/**
 * <h1>The Class Level.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Level {

    //Attributs
    private int list;
        
    //Methods
    public Level(int A) {
        super();
        this.list=A;
//        System.out.print("affiche : "+this.list+"\t");
    }

	public int getList() {
		return list;
	}

	public void setList(int list) {
		this.list = list;
	}
}
    
     /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */