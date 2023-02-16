package shapes;

abstract class Quadrilateral extends Shape{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }
    public abstract void setLength(int length);
    public abstract void setWidth(int width);
}

//public class Rectangle extends Quad implements Measurable{
//public Rest


