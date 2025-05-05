/**
 * Class that stores length and width of a rectangle
 * @author Radin Ajorlou
 * @version 1.0.0
 */
public class Rectangle{
    private double length;
    private double width;

    /**
     * Takes 2 arguments for length and width of the rectangle
     * @param length double - length of rectangle
     * @param width double - width of rectangle
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * Takes 1 argument for length and sets width to 8
     * @param length double - new length of rectangle
     */
    public Rectangle(double length){
        this(length, 8);
    }

    /**
     * Takes no arguments and sets length to 4 and width to 8
     */
    public Rectangle(){
        this(4, 8);
    }

    /**
     * Gets the length of the rectangle
     * @return double - length of rectangle
     */
    public double getLength(){
        return length;
    }

    /**
     * Gets the width of the rectangle
     * @return double - width of rectangle
     */
    public double getWidth(){
        return width;
    }
}