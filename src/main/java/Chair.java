/**
 * Class that stores the number of legs and the material of a chair
 * @author Radin Ajorlou
 * @version 1.0.0
 */

public class Chair {
    private int legs;
    private String material;

    /**
     * Takes 2 arguments for legs and material
     * @param legs int - how many legs on the chair
     * @param material String - the material of the wood
     */
    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    /**
     * Takes one argument for legs and sets material to wood
     * @param legs int - number of legs on the chair
     */
    public Chair(int legs){
        this(legs, "wood");
    }

    /**
     * Takes no argument, sets legs to 4 and material to wood
     */
    public Chair(){
        this(4, "wood");
    }

    /**
     * Gets the number of legs on the chair
     * @return int - number of legs
     */
    public int getLegs(){
        return legs;
    }

    /**
     * Gets the material of the chair
     * @return String - material of the chair
     */
    public String getMaterial(){
        return material;
    }
}
